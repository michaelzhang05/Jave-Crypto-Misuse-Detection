package x0;

import android.content.Context;
import android.util.Base64;
import com.getcapacitor.j0;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import w0.p;

/* loaded from: classes.dex */
public abstract class n {
    public static j0 a(Context context, String str) {
        if (!p.f().booleanValue()) {
            throw new Exception("decryptJSONObject: No Passphrase stored");
        }
        String e6 = p.e();
        try {
            byte[] decode = Base64.decode(str, 0);
            byte[] bytes = "jeep_capacitor_sqlite".getBytes("UTF-8");
            int length = decode.length - bytes.length;
            byte[] bArr = new byte[length];
            System.arraycopy(decode, 0, bytes, 0, bytes.length);
            System.arraycopy(decode, bytes.length, bArr, 0, length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(e6.toCharArray(), bytes, 65536, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bytes, 0, 12));
            return new j0(new String(cipher.doFinal(bArr), "UTF-8"));
        } catch (Exception e7) {
            e7.printStackTrace();
            throw new Exception("decryptJSONObject: " + e7.getMessage());
        }
    }

    public static String b(Context context, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (!p.f().booleanValue()) {
            throw new Exception("encryptJSONObject: No Passphrase stored");
        }
        String e6 = p.e();
        try {
            byte[] bytes = "jeep_capacitor_sqlite".getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(e6.toCharArray(), bytes, 65536, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bytes, 0, 12));
            byte[] doFinal = cipher.doFinal(jSONObject2.getBytes());
            byte[] bArr = new byte[bytes.length + doFinal.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            System.arraycopy(doFinal, 0, bArr, bytes.length, doFinal.length);
            return Base64.encodeToString(bArr, 0);
        } catch (Exception e7) {
            e7.printStackTrace();
            throw new Exception("encryptJSONObject: " + e7.getMessage());
        }
    }
}
