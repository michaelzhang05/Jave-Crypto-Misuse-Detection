package com.getcapacitor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
class i0 {

    /* renamed from: a, reason: collision with root package name */
    private String f4424a;

    /* renamed from: b, reason: collision with root package name */
    private String f4425b;

    /* renamed from: c, reason: collision with root package name */
    private String f4426c;

    /* renamed from: d, reason: collision with root package name */
    private String f4427d;

    /* renamed from: e, reason: collision with root package name */
    private String f4428e;

    /* renamed from: f, reason: collision with root package name */
    private String f4429f;

    /* renamed from: g, reason: collision with root package name */
    private String f4430g;

    public i0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4424a = str;
        this.f4425b = str2;
        this.f4426c = str3;
        this.f4427d = str4;
        this.f4428e = str5;
        this.f4429f = str6;
        this.f4430g = str7;
    }

    private String c(InputStream inputStream) {
        try {
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 1024);
                if (read < 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, read);
            }
        } catch (Exception e6) {
            l0.e("Unable to process HTML asset file. This is a fatal error", e6);
            return "";
        }
    }

    public InputStream a(InputStream inputStream) {
        StringBuilder sb;
        String str;
        String str2 = "<script type=\"text/javascript\">" + b() + "</script>";
        String c6 = c(inputStream);
        String str3 = "<head>";
        if (c6.contains("<head>")) {
            sb = new StringBuilder();
            sb.append("<head>\n");
            sb.append(str2);
            str = "\n";
        } else {
            str3 = "</head>";
            if (!c6.contains("</head>")) {
                l0.c("Unable to inject Capacitor, Plugins won't work");
                return new ByteArrayInputStream(c6.getBytes(StandardCharsets.UTF_8));
            }
            sb = new StringBuilder();
            sb.append(str2);
            str = "\n</head>";
        }
        sb.append(str);
        c6 = c6.replace(str3, sb.toString());
        return new ByteArrayInputStream(c6.getBytes(StandardCharsets.UTF_8));
    }

    public String b() {
        return this.f4424a + "\n\n" + this.f4430g + "\n\n" + this.f4425b + "\n\n" + this.f4426c + "\n\n" + this.f4427d + "\n\n" + this.f4429f + "\n\n" + this.f4428e;
    }
}
