package studio.aroundhub.codeground.lecture.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class SHA256Hash {

  public static void main(String[] args) throws NoSuchAlgorithmException {

    String message = sha256("secret data");

    System.out.println(message);
  }

  public static String sha256(String data) throws NoSuchAlgorithmException {

    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

    messageDigest.update(data.getBytes());

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
      sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
      // sb.append(String.format("%02x", b));
    }
    return sb.toString();
  }
}
