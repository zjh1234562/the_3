package Merchant;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class President {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Process proc;

        try {

            proc = Runtime.getRuntime().exec("python C:\\Users\\asus\\Desktop\\����ϵͳ\\kehu.py");// ִ��py�ļ�

            //���������������ȡ���

            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null) {

                System.out.println(line);

            }

            in.close();

            proc.waitFor();

        } catch (IOException e) {

            e.printStackTrace();

        } catch (InterruptedException e) {

            e.printStackTrace();

        } 

    }

}
