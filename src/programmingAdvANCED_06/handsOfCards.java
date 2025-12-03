package programmingAdvANCED_06;

import java.util.*;

public class handsOfCards {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String , Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String playerName = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];

            String[] cardsArray = cards.split(", ");

            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardsArray));


            if (!players.containsKey(playerName)){
                players.put(playerName , cardsSet);

            }else {

                Set<String> currentCards = players.get(playerName);

                currentCards.addAll(cardsSet);
                players.put(playerName , currentCards);
            }



            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> stringSetEntry : players.entrySet()) {
            System.out.printf("%s : %s",stringSetEntry.getKey() , stringSetEntry.getValue());
        }
    }
}
