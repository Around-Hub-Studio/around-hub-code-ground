package studio.aroundhub.codeground.lecture.programmers;

import java.util.HashMap;
import java.util.Map;

public class Openchat2019KakaoBlindRecruitment {

    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        int T = record.length;
        Map<String, String> user = new HashMap<>();

        String[] answer = new String[record.length];
        int index = 0;
        for (int i = 0; i < T; i++) {
            System.out.println(record[i]);
            String[] aInput = record[i].split(" ");
            if (aInput[0].equals("Enter")) {
                answer[index] = aInput[0] + " " + aInput[1];
                index++;
                user.put(aInput[1], aInput[2]);
            } else if (aInput[0].equals("Leave")) {
                answer[index] = aInput[0] + " " + aInput[1];
                index++;
            }else {
                user.put(aInput[1], aInput[2]);
            }

        }

        String[] ans = new String[index];
        for(int i = 0 ; i< ans.length; i++){
            System.out.print(i + " ");
            System.out.println(answer[i]);
            String[] spl = answer[i].split(" ");

            if(spl[0].equals("Enter")){
                ans[i] = user.get(spl[1]) + "님이 들어왔습니다.";
            }else{
                ans[i] = user.get(spl[1]) + "님이 나갔습니다.";
            }
        }

        //System.out.println(Arrays.toString(Arrays.stream(ans).toArray()));

    }

}
