����   A W
      java/lang/Object <init> ()V  Digite o seu nome
 
     javax/swing/JOptionPane showInputDialog &(Ljava/lang/Object;)Ljava/lang/String;  Digite a sua idade
      java/lang/Integer parseInt (Ljava/lang/String;)I  Digite a sua nota
      java/lang/Double parseDouble (Ljava/lang/String;)D	   ! " # $ java/lang/System out Ljava/io/PrintStream;   & ' ( makeConcatWithConstants (I)Ljava/lang/String;
 * + , - . java/io/PrintStream println (Ljava/lang/String;)V  0 ' 1 (D)Ljava/lang/String; 3 exemplo1 Code LineNumberTable LocalVariableTable this 
Lexemplo1; main ([Ljava/lang/String;)V args [Ljava/lang/String; nome Ljava/lang/String; idade I valor D MethodParameters 
SourceFile exemplo1.java BootstrapMethods H Idade:  J Nota =  L
 M N O ' P $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses S %java/lang/invoke/MethodHandles$Lookup U java/lang/invoke/MethodHandles Lookup ! 2           4   /     *� �    5        6        7 8   	 9 :  4   �     8� 	L� 	� =� 	� J� � %  � )� )� /  � )� +� )�    5             
 $  0  7  6   *    8 ; <    2 = >   ) ? @     A B  C    ;    D    E F     K  G K  I Q   
  R T V 