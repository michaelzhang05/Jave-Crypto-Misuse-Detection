package com.capacitorjs.plugins.filesystem;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import com.getcapacitor.j0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import t3.b0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f4202a;

    /* renamed from: com.capacitorjs.plugins.filesystem.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0074a extends j0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f4203a;

        C0074a(File file) {
            this.f4203a = file;
            m("path", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f4202a = context;
    }

    public File a(String str, String str2, String str3, String str4, boolean z5) {
        if (str4 == null) {
            str4 = str2;
        }
        File h6 = h(str, str2);
        File h7 = h(str3, str4);
        if (h6 == null) {
            throw new q0.a("from file is null");
        }
        if (h7 == null) {
            throw new q0.a("to file is null");
        }
        if (h7.equals(h6)) {
            return h7;
        }
        if (!h6.exists()) {
            throw new q0.a("The source object does not exist");
        }
        if (h7.getParentFile().isFile()) {
            throw new q0.a("The parent object of the destination is a file");
        }
        if (!h7.getParentFile().exists()) {
            throw new q0.a("The parent object of the destination does not exist");
        }
        if (h7.isDirectory()) {
            throw new q0.a("Cannot overwrite a directory");
        }
        h7.delete();
        if (!z5) {
            b(h6, h7);
        } else if (!h6.renameTo(h7)) {
            throw new q0.a("Unable to rename, unknown reason");
        }
        return h7;
    }

    public void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdir();
            for (String str : file.list()) {
                b(new File(file, str), new File(file2, str));
            }
            return;
        }
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            try {
                channel2.transferFrom(channel, 0L, channel.size());
                channel2.close();
                channel.close();
            } finally {
            }
        } catch (Throwable th) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean c(String str, String str2) {
        File h6 = h(str, str2);
        if (h6.exists()) {
            return h6.delete();
        }
        throw new FileNotFoundException("File does not exist");
    }

    public void d(File file) {
        if (file.isFile()) {
            file.delete();
            return;
        }
        for (File file2 : file.listFiles()) {
            d(file2);
        }
        file.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9 A[EDGE_INSN: B:21:0x00e9->B:22:0x00e9 BREAK  A[LOOP:0: B:5:0x00be->B:17:0x00be], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.getcapacitor.j0 e(com.getcapacitor.v0 r20, com.getcapacitor.h r21, z0.d.c r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.String r3 = "url"
            java.lang.String r4 = ""
            java.lang.String r3 = r1.o(r3, r4)
            com.getcapacitor.j0 r4 = new com.getcapacitor.j0
            r4.<init>()
            java.lang.String r5 = "headers"
            com.getcapacitor.j0 r4 = r1.l(r5, r4)
            com.getcapacitor.j0 r5 = new com.getcapacitor.j0
            r5.<init>()
            java.lang.String r6 = "params"
            com.getcapacitor.j0 r5 = r1.l(r6, r5)
            java.lang.String r6 = "connectTimeout"
            java.lang.Integer r6 = r1.i(r6)
            java.lang.String r7 = "readTimeout"
            java.lang.Integer r7 = r1.i(r7)
            java.lang.String r8 = "disableRedirects"
            java.lang.Boolean r8 = r1.e(r8)
            java.lang.String r9 = "shouldEncodeUrlParams"
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Boolean r9 = r1.f(r9, r10)
            java.lang.String r10 = "progress"
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r10 = r1.f(r10, r11)
            java.lang.String r11 = "method"
            java.lang.String r12 = "GET"
            java.lang.String r11 = r1.o(r11, r12)
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toUpperCase(r12)
            java.lang.String r12 = "path"
            java.lang.String r12 = r1.n(r12)
            java.lang.String r13 = "directory"
            java.lang.String r14 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.lang.String r1 = r1.o(r13, r14)
            java.net.URL r13 = new java.net.URL
            r13.<init>(r3)
            java.io.File r1 = r0.h(r12, r1)
            z0.d$b r3 = new z0.d$b
            r3.<init>()
            z0.d$b r3 = r3.h(r13)
            z0.d$b r3 = r3.f(r11)
            z0.d$b r3 = r3.e(r4)
            boolean r4 = r9.booleanValue()
            z0.d$b r3 = r3.i(r5, r4)
            z0.d$b r3 = r3.c(r6)
            z0.d$b r3 = r3.g(r7)
            z0.d$b r3 = r3.d(r8)
            z0.d$b r3 = r3.b()
            z0.c r3 = r3.a()
            r4 = r21
            r3.s(r4)
            java.io.InputStream r4 = r3.b()
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r6 = 0
            r5.<init>(r1, r6)
            java.lang.String r7 = "content-length"
            java.lang.String r3 = r3.c(r7)
            if (r3 == 0) goto Lb4
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Lb4
            goto Lb5
        Lb4:
            r3 = 0
        Lb5:
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]
            long r8 = java.lang.System.currentTimeMillis()
            r11 = 0
        Lbe:
            int r12 = r4.read(r7)
            if (r12 <= 0) goto Le9
            r5.write(r7, r6, r12)
            int r11 = r11 + r12
            boolean r12 = r10.booleanValue()
            if (r12 == 0) goto Lbe
            if (r2 == 0) goto Lbe
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r12 - r8
            r16 = 100
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto Lbe
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r2.a(r8, r9)
            r8 = r12
            goto Lbe
        Le9:
            boolean r6 = r10.booleanValue()
            if (r6 == 0) goto Lfc
            if (r2 == 0) goto Lfc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.a(r6, r3)
        Lfc:
            r4.close()
            r5.close()
            com.capacitorjs.plugins.filesystem.a$a r2 = new com.capacitorjs.plugins.filesystem.a$a
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.filesystem.a.e(com.getcapacitor.v0, com.getcapacitor.h, z0.d$c):com.getcapacitor.j0");
    }

    public File f(String str) {
        Context context = this.f4202a;
        str.hashCode();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1038134325:
                if (str.equals("EXTERNAL")) {
                    c6 = 0;
                    break;
                }
                break;
            case -564829544:
                if (str.equals("DOCUMENTS")) {
                    c6 = 1;
                    break;
                }
                break;
            case 2090922:
                if (str.equals("DATA")) {
                    c6 = 2;
                    break;
                }
                break;
            case 63879010:
                if (str.equals("CACHE")) {
                    c6 = 3;
                    break;
                }
                break;
            case 884191387:
                if (str.equals("LIBRARY")) {
                    c6 = 4;
                    break;
                }
                break;
            case 1013698023:
                if (str.equals("EXTERNAL_STORAGE")) {
                    c6 = 5;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return context.getExternalFilesDir(null);
            case 1:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
            case 2:
            case 4:
                return context.getFilesDir();
            case 3:
                return context.getCacheDir();
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return Environment.getExternalStorageDirectory();
            default:
                return null;
        }
    }

    public Charset g(String str) {
        if (str == null) {
            return null;
        }
        char c6 = 65535;
        switch (str.hashCode()) {
            case 3600241:
                if (str.equals("utf8")) {
                    c6 = 0;
                    break;
                }
                break;
            case 93106001:
                if (str.equals("ascii")) {
                    c6 = 1;
                    break;
                }
                break;
            case 111607308:
                if (str.equals("utf16")) {
                    c6 = 2;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return StandardCharsets.UTF_8;
            case 1:
                return StandardCharsets.US_ASCII;
            case 2:
                return StandardCharsets.UTF_16;
            default:
                return null;
        }
    }

    public File h(String str, String str2) {
        if (str2 == null) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || parse.getScheme().equals("file")) {
                return new File(parse.getPath());
            }
        }
        File f6 = f(str2);
        if (f6 == null) {
            return null;
        }
        if (!f6.exists()) {
            f6.mkdir();
        }
        return new File(f6, str);
    }

    public InputStream i(String str, String str2) {
        if (str2 == null) {
            Uri parse = Uri.parse(str);
            return parse.getScheme().equals("content") ? this.f4202a.getContentResolver().openInputStream(parse) : new FileInputStream(new File(parse.getPath()));
        }
        File f6 = f(str2);
        if (f6 != null) {
            return new FileInputStream(new File(f6, str));
        }
        throw new IOException("Directory not found");
    }

    public boolean j(String str, String str2, Boolean bool) {
        File h6 = h(str, str2);
        if (h6.exists()) {
            throw new q0.b("Directory exists");
        }
        return bool.booleanValue() ? h6.mkdirs() : h6.mkdir();
    }

    public String k(String str, String str2, Charset charset) {
        InputStream i6 = i(str, str2);
        return charset != null ? m(i6, charset.name()) : l(i6);
    }

    public String l(InputStream inputStream) {
        FileInputStream fileInputStream = (FileInputStream) inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public String m(InputStream inputStream, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(str);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public File[] n(String str, String str2) {
        File h6 = h(str, str2);
        if (h6 == null || !h6.exists()) {
            throw new q0.c("Directory does not exist");
        }
        return h6.listFiles();
    }

    public void o(File file, String str, Charset charset, Boolean bool) {
        if (charset != null) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, bool.booleanValue()), charset));
            bufferedWriter.write(str);
            bufferedWriter.close();
        } else {
            if (str.contains(",")) {
                str = str.split(",")[1];
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, bool.booleanValue());
            fileOutputStream.write(Base64.decode(str, 2));
            fileOutputStream.close();
        }
    }
}
