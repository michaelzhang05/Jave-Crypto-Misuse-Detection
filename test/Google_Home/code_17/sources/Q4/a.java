package Q4;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.InputStream;
import java.util.jar.JarFile;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f9159a = new StringBuilder();

    private int a(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[i8 + 2] << 16) & 16711680) | ((bArr[i8 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private String b(byte[] bArr, int i8, int i9, int i10) {
        if (i10 < 0) {
            return null;
        }
        return c(bArr, i9 + a(bArr, i8 + (i10 * 4)));
    }

    private String c(byte[] bArr, int i8) {
        int i9 = ((bArr[i8 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[i8] & 255);
        byte[] bArr2 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr2[i10] = bArr[i8 + 2 + (i10 * 2)];
        }
        return new String(bArr2);
    }

    private void d(byte[] bArr) {
        String str;
        int a8 = (a(bArr, 16) * 4) + 36;
        int a9 = a(bArr, 12);
        int i8 = a9;
        while (true) {
            if (i8 >= bArr.length - 4) {
                break;
            }
            if (a(bArr, i8) == 1048834) {
                a9 = i8;
                break;
            }
            i8 += 4;
        }
        int i9 = 0;
        while (true) {
            if (a9 >= bArr.length) {
                break;
            }
            int a10 = a(bArr, a9);
            int a11 = a(bArr, a9 + 20);
            if (a10 == 1048834) {
                int a12 = a(bArr, a9 + 28);
                a9 += 36;
                String b8 = b(bArr, 36, a8, a11);
                StringBuilder sb = new StringBuilder();
                for (int i10 = 0; i10 < a12; i10++) {
                    int a13 = a(bArr, a9 + 4);
                    int a14 = a(bArr, a9 + 8);
                    int a15 = a(bArr, a9 + 16);
                    a9 += 20;
                    String b9 = b(bArr, 36, a8, a13);
                    if (a14 != -1) {
                        str = b(bArr, 36, a8, a14);
                    } else {
                        str = "resourceID 0x" + Integer.toHexString(a15);
                    }
                    sb.append(" " + b9 + "=\"" + str + "\"");
                }
                e(i9, "<" + b8 + ((Object) sb) + ">");
                i9++;
            } else if (a10 == 1048835) {
                i9--;
                a9 += 24;
                e(i9, "</" + b(bArr, 36, a8, a11) + ">");
            } else if (a10 != 1048833) {
                Log.d("decompressXml", "  Unrecognized tag code '" + Integer.toHexString(a10) + "' at offset " + a9);
            }
        }
        Log.d("decompressXml", "    end at offset " + a9);
    }

    private void e(int i8, String str) {
        String str2 = "                                             ".substring(0, Math.min(i8 * 2, 45)) + str;
        StringBuilder sb = this.f9159a;
        sb.append(str2);
        sb.append('\n');
    }

    public String f(String str) {
        try {
            JarFile jarFile = new JarFile(str);
            InputStream inputStream = jarFile.getInputStream(jarFile.getEntry("AndroidManifest.xml"));
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            d(bArr);
        } catch (Exception e8) {
            Log.d("decompressXml", "getIntents, ex: " + e8);
            e8.printStackTrace();
        }
        return this.f9159a.toString();
    }
}
