package javaFundamentals.week5.Excercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class UE10SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();

        while (!commands.equals("course start")){

            String[] arrayOfCommands = commands.split(":");
            String command = arrayOfCommands[0];
            String lessonTitle = arrayOfCommands[1];
            int indexOfLesson1 = schedule.indexOf(lessonTitle);

            switch (command){
                case "Add":

                    if (!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int tempIndex = Integer.parseInt(arrayOfCommands[2]);
                    if (!schedule.contains(lessonTitle)){
                        schedule.add(tempIndex, lessonTitle);
                    }
                    break;

                case "Remove":
                    if (schedule.contains(lessonTitle)){
                        if (indexOfLesson1 == schedule.size() - 1) {
                            schedule.remove(lessonTitle);
                        }else if (schedule.get(indexOfLesson1 + 1).equals(lessonTitle + "-Exercise")) {
                            schedule.remove(schedule.get(indexOfLesson1 + 1));
                        }

                    }

                    schedule.remove(lessonTitle);
                    break;

                case "Swap":
                    String lessonTitleToSwap = arrayOfCommands[2];

                    int indexOfLessonToSwap = schedule.indexOf(lessonTitleToSwap);
                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitleToSwap)){
                        if (indexOfLesson1 != schedule.size() -1){
                            if (schedule.get(indexOfLesson1 + 1).equals(lessonTitle+"-Exercise")){
                                schedule.add(indexOfLessonToSwap+1, lessonTitle+"-Exercise");
                                schedule.remove(indexOfLesson1 +2);
                            }
                        }
                        if (indexOfLessonToSwap != schedule.size() - 1){
                            if(schedule.get(indexOfLessonToSwap + 1).equals(lessonTitleToSwap+"-Exercise")){
                                schedule.add(indexOfLesson1 + 1, lessonTitleToSwap+"-Exercise");
                                schedule.remove(indexOfLessonToSwap +2);
                            }
                        }

                        schedule.set(schedule.indexOf(lessonTitleToSwap), lessonTitle);
                        schedule.set(indexOfLesson1, lessonTitleToSwap);

                    }
                    break;

                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    if (schedule.contains(lessonTitle)){
                        if (indexOfLesson1 == schedule.size() - 1) {
                            schedule.add(exercise);
                            break;
                        }
                        if (!schedule.get(indexOfLesson1 + 1).equals(exercise)) {
                            schedule.add(indexOfLesson1 + 1, exercise);
                        }

                    }else{
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            commands = scanner.nextLine();

        }
        int number = 1;
        for (String courses: schedule) {
            System.out.println(number + "." + courses);
            number++;
        }

    }
}
