package com.airbnb.lottie.s;

import com.airbnb.lottie.s.j.n;
import java.util.List;

/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public class d {
    private final List<n> a;

    /* renamed from: b, reason: collision with root package name */
    private final char f8108b;

    /* renamed from: c, reason: collision with root package name */
    private final double f8109c;

    /* renamed from: d, reason: collision with root package name */
    private final double f8110d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8111e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8112f;

    public d(List<n> list, char c2, double d2, double d3, String str, String str2) {
        this.a = list;
        this.f8108b = c2;
        this.f8109c = d2;
        this.f8110d = d3;
        this.f8111e = str;
        this.f8112f = str2;
    }

    public static int c(char c2, String str, String str2) {
        return ((((0 + c2) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<n> a() {
        return this.a;
    }

    public double b() {
        return this.f8110d;
    }

    public int hashCode() {
        return c(this.f8108b, this.f8112f, this.f8111e);
    }
}
