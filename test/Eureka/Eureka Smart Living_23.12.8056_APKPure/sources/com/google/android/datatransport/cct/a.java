package com.google.android.datatransport.cct;

import d1.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f4503c;

    /* renamed from: d, reason: collision with root package name */
    static final String f4504d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f4505e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f4506f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f4507g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f4508h;

    /* renamed from: a, reason: collision with root package name */
    private final String f4509a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4510b;

    static {
        String a6 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4503c = a6;
        String a7 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f4504d = a7;
        String a8 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4505e = a8;
        f4506f = Collections.unmodifiableSet(new HashSet(Arrays.asList(b1.b.b("proto"), b1.b.b("json"))));
        f4507g = new a(a6, null);
        f4508h = new a(a7, a8);
    }

    public a(String str, String str2) {
        this.f4509a = str;
        this.f4510b = str2;
    }

    public static a d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // d1.g
    public Set a() {
        return f4506f;
    }

    @Override // d1.f
    public String b() {
        return "cct";
    }

    public byte[] c() {
        String str = this.f4510b;
        if (str == null && this.f4509a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f4509a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String e() {
        return this.f4510b;
    }

    public String f() {
        return this.f4509a;
    }

    @Override // d1.f
    public byte[] getExtras() {
        return c();
    }
}
