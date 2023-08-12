package org.code.challenges.leetcode.hashing.medium;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {
    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>();
        Set<Integer> oneLoss = new HashSet<>();
        Set<Integer> moreLosses = new HashSet<>();
        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            // Add winner.
            if (!oneLoss.contains(winner) && !moreLosses.contains(winner)) {
                zeroLoss.add(winner);
            }
            // Add or move loser.
            if (zeroLoss.contains(loser)) {
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            } else if (oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLosses.add(loser);
            } else if (moreLosses.contains(loser)) {
                continue;
            } else {
                oneLoss.add(loser);
            }
        }

        List<List<Integer>> answer = Arrays.asList(new ArrayList<>(), new ArrayList<>());

        answer.get(0).addAll(zeroLoss);
        answer.get(1).addAll(oneLoss);
        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }

    public static List<List<Integer>> findWinners_HashSetAndMap(int[][] matches) {

        Set<Integer> seen = new HashSet<>();
        Map<Integer, Integer> losesCount = new HashMap();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            seen.add(winner);
            seen.add(loser);
            losesCount.put(loser, losesCount.getOrDefault(loser, 0) + 1);
        }
        List<List<Integer>> answer = Arrays.asList(new ArrayList(), new ArrayList());
        for (int player : seen) {

            if (!losesCount.containsKey(player)) {
                answer.get(0).add(player);
            } else if (losesCount.get(player) == 1) {
                answer.get(1).add(player);
            }
        }
        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }

    public static List<List<Integer>> findWinners_HashMap(int[][] numbers) {

        Map<Integer, Integer> lossesCount = new HashMap<>();
        for (int[] match : numbers) {
            int winner = match[0];
            int loser = match[1];
            lossesCount.put(winner, lossesCount.getOrDefault(winner, 0));
            lossesCount.put(loser, lossesCount.getOrDefault(loser, 0) + 1);
        }

        List<List<Integer>> answer = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for (int player : lossesCount.keySet()) {
            if (lossesCount.get(player) == 0) {
                answer.get(0).add(player);
            } else if (lossesCount.get(player) == 1) {
                answer.get(1).add(player);

            }
        }


        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(findWinners_HashSetAndMap(new int[][]{{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}}));
    }
}
