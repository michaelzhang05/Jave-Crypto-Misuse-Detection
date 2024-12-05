package l7;

import i7.C3011b;
import i7.InterfaceC3010a;
import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: l7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3396b implements InterfaceC3010a {

    /* renamed from: e, reason: collision with root package name */
    private static Permission f34677e = new C3011b("BC", "threadLocalEcImplicitlyCa");

    /* renamed from: f, reason: collision with root package name */
    private static Permission f34678f = new C3011b("BC", "ecImplicitlyCa");

    /* renamed from: g, reason: collision with root package name */
    private static Permission f34679g = new C3011b("BC", "threadLocalDhDefaultParams");

    /* renamed from: h, reason: collision with root package name */
    private static Permission f34680h = new C3011b("BC", "DhDefaultParams");

    /* renamed from: i, reason: collision with root package name */
    private static Permission f34681i = new C3011b("BC", "acceptableEcCurves");

    /* renamed from: j, reason: collision with root package name */
    private static Permission f34682j = new C3011b("BC", "additionalEcParameters");

    /* renamed from: a, reason: collision with root package name */
    private ThreadLocal f34683a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private ThreadLocal f34684b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    private volatile Set f34685c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f34686d = new HashMap();
}
