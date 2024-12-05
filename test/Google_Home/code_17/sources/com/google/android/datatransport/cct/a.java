package com.google.android.datatransport.cct;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import s.C3982c;
import u.g;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f15806c;

    /* renamed from: d, reason: collision with root package name */
    static final String f15807d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f15808e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f15809f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f15810g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f15811h;

    /* renamed from: a, reason: collision with root package name */
    private final String f15812a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15813b;

    static {
        String a8 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f15806c = a8;
        String a9 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f15807d = a9;
        String a10 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f15808e = a10;
        f15809f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(C3982c.b("proto"), C3982c.b("json"))));
        f15810g = new a(a8, null);
        f15811h = new a(a9, a10);
    }

    public a(String str, String str2) {
        this.f15812a = str;
        this.f15813b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // u.g
    public Set a() {
        return f15809f;
    }

    public byte[] b() {
        String str = this.f15813b;
        if (str == null && this.f15812a == null) {
            return null;
        }
        String str2 = this.f15812a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String d() {
        return this.f15813b;
    }

    public String e() {
        return this.f15812a;
    }

    @Override // u.f
    public byte[] getExtras() {
        return b();
    }

    @Override // u.f
    public String getName() {
        return "cct";
    }
}
