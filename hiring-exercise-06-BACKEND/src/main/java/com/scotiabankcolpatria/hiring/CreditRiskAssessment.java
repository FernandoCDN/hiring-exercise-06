package com.scotiabankcolpatria.hiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CreditRiskAssessment
{
    public static void main(String[] args)
    {
        SpringApplication.run(CreditRiskAssessment.class, args);
    }

    /**
     * Método que calcula la desviación estandar poblaciónal del arreglo de retrasos de pagos
     * @param paymentDelays
     * @return
     */
    public double standardDeviation(int[] paymentDelays)
    {
        double average = calculateAverage(paymentDelays);

        double variance = calculateVariance(paymentDelays,average);

        return Math.sqrt(variance);
    }


    /**
     * Método que obtiene el indice en el arreglo de entrada donde se encuentra el pago anómalo con el pico más alto
     * @param paymentDelays
     * @return
     */
    public int paymentDelayMaxPeakIndex(int[] paymentDelays)
    {
        int Peak = 0;
        int leftValue = 0;
        int rightValue = 0;
        int middleValue = 0;
        int indice = 0;

        for (int i = 0; i < paymentDelays.length; i++)
        {
            rightValue = (i+1) == paymentDelays.length ? 0 : paymentDelays[i+1];
            middleValue = paymentDelays[i];

            if(leftValue < middleValue && middleValue > rightValue)
            {
                Peak = paymentDelays[i];
                indice = i;
            }

            leftValue = paymentDelays[i];
        }

        if(Peak == 0) return -1;
        else return indice;
    }


    /**
     * Método que calcula la probabilidad de pagos tardíos de una matriz de datos
     * @param paymentDelays
     * @return
     */
    public double[] latePaymentProbabilityByPeriod(int[][] paymentDelays)
    {
        int [][] paymentMatriz = transposeMatriz(paymentDelays);
        int [] delaysCount = countPayDelays(paymentMatriz);

        double [] paymentProbability = new double[delaysCount.length];

        for(int i = 0; i < delaysCount.length; i++)
        {
            double count = delaysCount[i];
            paymentProbability[i] = (double)(count / 4);
        }

        return paymentProbability;
    }


    /**
     * Método que calcula el promedio de datos del arreglo de retrasos de pagos
     * @param paymentDelays
     */
    public double calculateAverage(int [] paymentDelays)
    {
        int sum = 0;

        for (int paymentDelay : paymentDelays)
        {
            sum += paymentDelay;
        }

        return (double) sum / paymentDelays.length;
    }


    /**
     * Método que calcula la varianza poblacional de los datos del arreglo de retrasos de pagos
     * @param paymentDelays
     * @param average
     * @return
     */
    public double calculateVariance (int [] paymentDelays, double average)
    {
        double sum = 0.0;

        for (int paymentDelay : paymentDelays)
        {
            sum += Math.pow((double)(paymentDelay-average),2);
        }

        return (double) sum/paymentDelays.length;
    }


    /**
     * Método que realiza la transpuesta a la matriz de entrada
     *
     * @param matriz Matriz de entrada
     * @return
     */
    public int[][] transposeMatriz(int[][] matriz)
    {
        int[][] newMatriz = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[0].length; j++)
            {
                newMatriz[j][i] = matriz[i][j];
                // nueva[i][j] = matriz[j][i]; // Línea errónea
            }
        }
        return newMatriz;
    }


    /**
     * Método que cuenta el número de retrasos en los pagos de una Matriz de entrada
     * @param paymentMatriz
     * @return
     */
    public int[] countPayDelays(int[][] paymentMatriz)
    {
        int[] paymentNumberDelays = new int[paymentMatriz.length];
        int index = 0;

        for(int [] paymentDelay: paymentMatriz)
        {
            for(int pay: paymentDelay)
            {
                if(pay>0)
                {
                    paymentNumberDelays[index] += 1;
                }
            }

            index++;
        }

        return paymentNumberDelays;
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
            }
        };
    }

}
