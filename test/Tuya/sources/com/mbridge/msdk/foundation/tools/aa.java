package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: b, reason: collision with root package name */
    protected static MessageDigest f19968b;

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f19967a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    private static String f19969c = "SameFileMD5";

    static {
        f19968b = null;
        try {
            f19968b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e8) {
            System.err.println(aa.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e8.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        MessageDigest messageDigest;
        RandomAccessFile randomAccessFile;
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[10485760];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            String a8 = a(digest, 0, digest.length);
            try {
                randomAccessFile.close();
            } catch (IOException e8) {
                ad.b(f19969c, e8.getMessage());
            }
            return a8;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            try {
                ad.b(f19969c, th.getMessage());
                return "";
            } finally {
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e9) {
                        ad.b(f19969c, e9.getMessage());
                    }
                }
            }
        }
    }

    private static String a(byte[] bArr, int i8, int i9) {
        StringBuffer stringBuffer = new StringBuffer(i9 * 2);
        int i10 = i9 + i8;
        while (i8 < i10) {
            byte b8 = bArr[i8];
            char[] cArr = f19967a;
            char c8 = cArr[(b8 & 240) >> 4];
            char c9 = cArr[b8 & 15];
            stringBuffer.append(c8);
            stringBuffer.append(c9);
            i8++;
        }
        return stringBuffer.toString();
    }
}
