����   A j
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  Apolice
    P
----- Sistema de Apolice -----
[1] Criar Apolice
[2] Ver Dados Apolice
[3] Sair
      javax/swing/JOptionPane showInputDialog &(Ljava/lang/Object;)Ljava/lang/String;
     ! " java/lang/Integer parseInt (Ljava/lang/String;)I $ Digite o numero & Digite o nome ( Digite a idade * Digite o sexo [M] ou [F]
 , - . / 0 java/lang/String charAt (I)C 2 Digite o valor do automovel
 4 5 6 7 8 java/lang/Double parseDouble (Ljava/lang/String;)D
  :  ; (ILjava/lang/String;ICD)V	 
 = > ? out Ljava/io/PrintStream;
  A B C imprimir ()Ljava/lang/String;
 E F G H I java/io/PrintStream println (Ljava/lang/String;)V K Opcao invalida! M Main_Apolice Code LineNumberTable LocalVariableTable this LMain_Apolice; main ([Ljava/lang/String;)V numero I nome Ljava/lang/String; idade sexo C valor D num args [Ljava/lang/String; scn Ljava/util/Scanner; apo 	LApolice; sair StackMapTable MethodParameters 
SourceFile Main_Apolice.java ! L           N   /     *� �    O        P        Q R   	 S T  N  �     �� Y� 	� L� Y� M>� � 6�     n            \   i#� � 6%� :'� � 6)� � +61� � 39	,	� 9� � <,� @� D� >� � <J� D��|�    O   N      
       <  F  M  W  b  l  z  }  �  � ! � " � % � ' � ( P   f 
 F 7 U V  M 0 W X  W & Y V  b  Z [  l  \ ] 	  x ^ V    � _ `    � a b   � c d   � e V  f    �   � &� @�  g    _    h    i