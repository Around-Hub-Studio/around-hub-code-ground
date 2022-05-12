package lecture.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MD5Hash {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String message = md5("secret data");

        System.out.println("hash data : " + message);

    }

    /**
     * MessageDigest 객체를 초기화 하면서 MD5 알고리즘을 설정
     * 알고리즘 작업을 마친 암호화 값은 바이너리 데이터이므로 16진수 문자열로 변환하여 사용함
     *
     * @param data
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String md5(String data) throws NoSuchAlgorithmException {

        // MD5 MessageDigest 객체 생성
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        // 데이터 값을 바이트 형식으로 받아 다이제스트를 갱신
        messageDigest.update(data.getBytes());

        // Byte 배열 값 확인하기 위한 출력문
        System.out.println(Arrays.toString(messageDigest.digest()));

        return byteToHexString(messageDigest.digest());
    }

    /**
     * 바이너리 데이터(byte 배열)를 16진수의 문자열로 변환하여 값을 리턴
     *
     * @param data hash 처리된 바이너리 데이터
     * @return 16진수 문자열
     */
    public static String byteToHexString(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            //sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            sb.append(String.format("%02x", b)); // %02x : b 를 2자리 Hex String 으로 출력
        }
        return sb.toString();
    }

}
