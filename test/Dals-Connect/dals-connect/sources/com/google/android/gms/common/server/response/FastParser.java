package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] a = {'u', 'l', 'l'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f10944b = {'r', 'u', 'e'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f10945c = {'r', 'u', 'e', '\"'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f10946d = {'a', 'l', 's', 'e'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f10947e = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f10948f = {'\n'};

    /* renamed from: g, reason: collision with root package name */
    private static final a<Integer> f10949g = new com.google.android.gms.common.server.response.a();

    /* renamed from: h, reason: collision with root package name */
    private static final a<Long> f10950h = new b();

    /* renamed from: i, reason: collision with root package name */
    private static final a<Float> f10951i = new c();

    /* renamed from: j, reason: collision with root package name */
    private static final a<Double> f10952j = new d();

    /* renamed from: k, reason: collision with root package name */
    private static final a<Boolean> f10953k = new e();
    private static final a<String> l = new f();
    private static final a<BigInteger> m = new g();
    private static final a<BigDecimal> n = new h();
    private final char[] o = new char[1];
    private final char[] p = new char[32];
    private final char[] q = new char[1024];
    private final StringBuilder r = new StringBuilder(32);
    private final StringBuilder s = new StringBuilder(1024);
    private final Stack<Integer> t = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ParseException extends Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface a<O> {
    }
}
