package com.google.firebase.installations;

import android.text.TextUtils;
import d1.AbstractC2734d;
import f1.C2815b;
import f1.InterfaceC2814a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final long f18323b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18324c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static i f18325d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2814a f18326a;

    private i(InterfaceC2814a interfaceC2814a) {
        this.f18326a = interfaceC2814a;
    }

    public static i c() {
        return d(C2815b.a());
    }

    public static i d(InterfaceC2814a interfaceC2814a) {
        if (f18325d == null) {
            f18325d = new i(interfaceC2814a);
        }
        return f18325d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f18324c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f18326a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(AbstractC2734d abstractC2734d) {
        if (TextUtils.isEmpty(abstractC2734d.b()) || abstractC2734d.h() + abstractC2734d.c() < b() + f18323b) {
            return true;
        }
        return false;
    }
}
