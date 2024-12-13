    package org.example;
    import java.util.Random;
    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int xP = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            int yP = scanner1.nextInt();

            Tortle tortle = new Tortle(0, 0);
            Ant ant = new Ant(0, 0);
            Kyznechik kyznechik = new Kyznechik(0, 0);
            Snake snake = new Snake(0, 0);
            Pig pig = new Pig(0, 0);
            Bird bird = new Bird(0, 0);

            Random randomX = new Random();
            int xFinish = randomX.nextInt(xP) + 1;
            Random randomY = new Random();
            int yFinish = randomY.nextInt(yP) + 1;

            System.out.println("xfin = " + xFinish + " yfin = " + yFinish);
          cord(xFinish, yFinish, pig, snake, tortle, ant, kyznechik, bird, xP, yP);
        }
        public static void cord(int xFinish, int yFinish, Pig pig ,   Snake snake,
                                 Tortle tortle, Ant ant, Kyznechik kyznechik, Bird bird, int yP, int xP) {

            while ((tortle.getxTortle() != xFinish || tortle.getyTortle() != yFinish) && (pig.getxPig() != xFinish || pig.getyPig() != yFinish)
                    && (snake.getxSnake() != xFinish || snake.getySnake() != yFinish) && (bird.getxBird() != xFinish || bird.getyBird() != yFinish)
                    && (kyznechik.getxKyznechik() != xFinish || kyznechik.getyKyznechik() != yFinish) && (ant.getxAnt() != xFinish || ant.getyAnt() != yFinish)) {

                Random n1 = new Random();
                int nT = n1.nextInt(4);

                Random n2 = new Random();
                int nB = n2.nextInt(4);

                Random n3 = new Random();
                int nS = n3.nextInt(4);

                Random n4 = new Random();
                int nA = n4.nextInt(4);

                Random n5 = new Random();
                int nK = n5.nextInt(4);

                Random n6 = new Random();
                int nP = n6.nextInt(4);

                if (nT == 0 && tortle.getyTortle() + 1 <= yP && tortle.getxTortle() <= xP) {
                    tortle.setyTortle(tortle.getyTortle() + 1);
                }else if (nT == 1 && tortle.getxTortle() + 1 <= xP && tortle.getyTortle() <= yP ){
                    tortle.setxTortle(tortle.getxTortle() + 1);
                }else if (nT == 2 && tortle.getyTortle() - 1 <= yP && tortle.getxTortle() <= xP && tortle.getxTortle() >= 0 && tortle.getyTortle() - 1 >= 0){
                    tortle.setyTortle(tortle.getyTortle() - 1);
                }else if (nT == 3 && tortle.getxTortle() - 1 <= xP && tortle.getyTortle() <= yP && tortle.getxTortle() - 1 >= 0 && tortle.getyTortle() >= 0){
                    tortle.setxTortle(tortle.getxTortle() - 1);
                }else if (nT == 0 && tortle.getyTortle() + 1 > yP) {
                    tortle.setyTortle(tortle.getyTortle());
                }else if (nT == 1 && tortle.getxTortle() + 1 > xP ){
                    tortle.setxTortle(tortle.getxTortle() );
                }else if (nT == 2 && tortle.getyTortle() - 1 > yP ){
                    tortle.setyTortle(tortle.getyTortle());
                }else if (nT == 3 && tortle.getxTortle() - 1 > xP ){
                    tortle.setxTortle(tortle.getxTortle());
                }

                if (nB == 0 && bird.getyBird() + 1 <= yP && bird.getxBird() <= xP) {
                    bird.setyBird(bird.getyBird() + 1);
                }else if (nB == 1 && bird.getxBird() + 1 <= xP && bird.getyBird() <= yP ){
                    bird.setxBird(bird.getxBird() + 1);
                }else if (nB == 2 && bird.getyBird() - 1 <= yP && bird.getxBird() <= xP && bird.getxBird() >= 0 && bird.getyBird() - 1 >= 0){
                    bird.setyBird(bird.getyBird() - 1);
                }else if (nB == 3 && bird.getxBird() - 1 <= xP && bird.getyBird() <= yP && bird.getxBird() - 1 >= 0 && bird.getyBird() >= 0){
                    bird.setxBird(bird.getxBird() - 1);
                }else if (nB == 0 && bird.getyBird() + 1 > yP) {
                    bird.setyBird(bird.getyBird());
                }else if (nB == 1 && bird.getxBird() + 1 > xP ){
                    bird.setxBird(bird.getxBird() );
                }else if (nB == 2 && bird.getyBird() - 1 > yP ){
                    bird.setyBird(bird.getyBird());
                }else if (nB == 3 && bird.getxBird() - 1 > xP ){
                    bird.setxBird(bird.getxBird());
                }

                if (nS == 0 && snake.getySnake() + 1 <= yP && snake.getxSnake() <= xP) {
                    snake.setySnake(snake.getySnake() + 1);
                }else if (nS == 1 && snake.getxSnake() + 1 <= xP && snake.getySnake() <= yP ){
                    snake.setxSnake(snake.getxSnake() + 1);
                }else if (nS == 2 && snake.getySnake() - 1 <= yP && snake.getxSnake() <= xP && snake.getxSnake() >= 0 && snake.getySnake() - 1 >= 0){
                    snake.setySnake(snake.getySnake() - 1);
                }else if (nS == 3 && snake.getxSnake() - 1 <= xP && snake.getySnake() <= yP && snake.getxSnake() - 1 >= 0 && snake.getySnake() >= 0){
                    snake.setxSnake(snake.getxSnake() - 1);
                }else if (nS == 0 && snake.getySnake() + 1 > yP) {
                    snake.setySnake(snake.getySnake());
                }else if (nS == 1 && snake.getxSnake() + 1 > xP ){
                    snake.setxSnake(snake.getxSnake() );
                }else if (nS == 2 && snake.getySnake() - 1 > yP ){
                    snake.setySnake(snake.getySnake());
                }else if (nS == 3 && snake.getxSnake() - 1 > xP ){
                    snake.setxSnake(snake.getxSnake());
                }

                if (nP == 0 && pig.getyPig() + 1 <= yP && pig.getxPig() <= xP) {
                    pig.setyPig(pig.getyPig() + 1);
                }else if (nP == 1 && pig.getxPig() + 1 <= xP && pig.getyPig() <= yP ){
                    pig.setxPig(pig.getxPig() + 1);
                }else if (nP == 2 && pig.getyPig() - 1 <= yP && pig.getxPig() <= xP && pig.getxPig() >= 0 && pig.getyPig() - 1 >= 0){
                    pig.setyPig(pig.getyPig() - 1);
                }else if (nP == 3 && pig.getxPig() - 1 <= xP && pig.getyPig() <= yP && pig.getxPig() - 1 >= 0 && pig.getyPig() >= 0){
                    pig.setxPig(pig.getxPig() - 1);
                }else if (nP == 0 && pig.getyPig() + 1 > yP) {
                    pig.setyPig(pig.getyPig());
                }else if (nP == 1 && pig.getxPig() + 1 > xP ){
                    pig.setxPig(pig.getxPig() );
                }else if (nP == 2 && pig.getyPig() - 1 > yP ){
                    pig.setyPig(pig.getyPig());
                }else if (nP == 3 && pig.getxPig() - 1 > xP ){
                    pig.setxPig(pig.getxPig());
                }

                if (nA == 0 && ant.getyAnt() + 1 <= yP && ant.getxAnt() <= xP) {
                    ant.setyAnt(ant.getyAnt() + 1);
                }else if (nA == 1 && ant.getxAnt() + 1 <= xP && ant.getyAnt() <= yP ){
                    ant.setxAnt(ant.getxAnt() + 1);
                }else if (nA == 2 && ant.getyAnt() - 1 <= yP && ant.getxAnt() <= xP && ant.getxAnt() >= 0 && ant.getyAnt() - 1 >= 0){
                    ant.setyAnt(ant.getyAnt() - 1);
                }else if (nA == 3 && ant.getxAnt() - 1 <= xP && ant.getyAnt() <= yP && ant.getxAnt() - 1 >= 0 && ant.getyAnt() >= 0){
                    ant.setxAnt(ant.getxAnt() - 1);
                }else if (nA == 0 && ant.getyAnt() + 1 > yP) {
                    ant.setyAnt(ant.getyAnt());
                }else if (nA == 1 && ant.getxAnt() + 1 > xP ){
                    ant.setxAnt(ant.getxAnt() );
                }else if (nA == 2 && ant.getyAnt() - 1 > yP ){
                    ant.setyAnt(ant.getyAnt());
                }else if (nA == 3 && ant.getxAnt() - 1 > xP ){
                    ant.setxAnt(ant.getxAnt());
                }

                if (nK == 0 && kyznechik.getyKyznechik() + 1 <= yP && kyznechik.getxKyznechik() <= xP) {
                    kyznechik.setyKyznechik(kyznechik.getyKyznechik() + 1);
                }else if (nK == 1 && kyznechik.getxKyznechik() + 1 <= xP && kyznechik.getyKyznechik() <= yP ){
                    kyznechik.setxKyznechik(kyznechik.getxKyznechik() + 1);
                }else if (nK == 2 && kyznechik.getyKyznechik() - 1 <= yP && kyznechik.getxKyznechik() <= xP && kyznechik.getxKyznechik() >= 0 && kyznechik.getyKyznechik() - 1 >= 0){
                    kyznechik.setyKyznechik(kyznechik.getyKyznechik() - 1);
                }else if (nK == 3 && kyznechik.getxKyznechik() - 1 <= xP && kyznechik.getyKyznechik() <= yP && kyznechik.getxKyznechik() - 1 >= 0 && kyznechik.getyKyznechik() >= 0){
                    kyznechik.setxKyznechik(kyznechik.getxKyznechik() - 1);
                }else if (nK == 0 && kyznechik.getyKyznechik() + 1 > yP) {
                    kyznechik.setyKyznechik(kyznechik.getyKyznechik());
                }else if (nK == 1 && kyznechik.getxKyznechik() + 1 > xP ){
                    kyznechik.setxKyznechik(kyznechik.getxKyznechik() );
                }else if (nK == 2 && kyznechik.getyKyznechik() - 1 > yP ){
                    kyznechik.setyKyznechik(kyznechik.getyKyznechik());
                }else if (nK == 3 && kyznechik.getxKyznechik() - 1 > xP ){
                    kyznechik.setxKyznechik(kyznechik.getxKyznechik());
                }



                if (tortle.getxTortle() == xFinish && tortle.getyTortle() == yFinish) {
                    System.out.println("победила черепаха");
                }
                if (pig.getxPig() == xFinish && pig.getyPig() == yFinish) {
                    System.out.println("победил свин");
                }
                if (snake.getxSnake() == xFinish && snake.getySnake() == yFinish) {
                    System.out.println("победила змея");
                }
                if (bird.getxBird() == xFinish && bird.getyBird() == yFinish) {
                    System.out.println("победила птица");
                }
                if (kyznechik.getxKyznechik() == xFinish && kyznechik.getyKyznechik() == yFinish) {
                    System.out.println("победил кузнечик");
                }
                if (ant.getxAnt() == xFinish && ant.getyAnt() == yFinish) {
                    System.out.println("победил муравей");
                }
            }
            System.out.println(bird.toString() + "\n" + snake.toString() + "\n" + tortle.toString() + "\n" + ant.toString() + "\n" +
                    pig.toString() + "\n" + kyznechik.toString());

        }
    }
