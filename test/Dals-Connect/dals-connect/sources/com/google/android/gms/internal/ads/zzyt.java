package com.google.android.gms.internal.ads;

import java.util.Random;
import java.util.WeakHashMap;

@zzard
/* loaded from: classes2.dex */
public final class zzyt {
    private static zzyt a = new zzyt();

    /* renamed from: b, reason: collision with root package name */
    private final zzazt f15825b;

    /* renamed from: c, reason: collision with root package name */
    private final zzyh f15826c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15827d;

    /* renamed from: e, reason: collision with root package name */
    private final zzacp f15828e;

    /* renamed from: f, reason: collision with root package name */
    private final zzacq f15829f;

    /* renamed from: g, reason: collision with root package name */
    private final zzacr f15830g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbai f15831h;

    /* renamed from: i, reason: collision with root package name */
    private final Random f15832i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakHashMap<Object, String> f15833j;

    protected zzyt() {
        this(new zzazt(), new zzyh(new zzxx(), new zzxw(), new zzabk(), new zzagk(), new zzatf(), new zzauj(), new zzaqf(), new zzagl()), new zzacp(), new zzacq(), new zzacr(), zzazt.x(), new zzbai(0, 15000000, true), new Random(), new WeakHashMap());
    }

    public static zzazt a() {
        return a.f15825b;
    }

    public static zzyh b() {
        return a.f15826c;
    }

    public static zzacq c() {
        return a.f15829f;
    }

    public static zzacp d() {
        return a.f15828e;
    }

    public static zzacr e() {
        return a.f15830g;
    }

    public static String f() {
        return a.f15827d;
    }

    public static zzbai g() {
        return a.f15831h;
    }

    public static Random h() {
        return a.f15832i;
    }

    private zzyt(zzazt zzaztVar, zzyh zzyhVar, zzacp zzacpVar, zzacq zzacqVar, zzacr zzacrVar, String str, zzbai zzbaiVar, Random random, WeakHashMap<Object, String> weakHashMap) {
        this.f15825b = zzaztVar;
        this.f15826c = zzyhVar;
        this.f15828e = zzacpVar;
        this.f15829f = zzacqVar;
        this.f15830g = zzacrVar;
        this.f15827d = str;
        this.f15831h = zzbaiVar;
        this.f15832i = random;
        this.f15833j = weakHashMap;
    }
}
