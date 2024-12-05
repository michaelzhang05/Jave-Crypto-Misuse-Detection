package X1;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f12205a;

    /* renamed from: b, reason: collision with root package name */
    public f f12206b;

    /* renamed from: c, reason: collision with root package name */
    public f f12207c;

    public e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.f12205a = concurrentHashMap;
        concurrentHashMap.put(Date.class, b.f12204c);
        concurrentHashMap.put(int[].class, a.f12188c);
        concurrentHashMap.put(Integer[].class, a.f12189d);
        concurrentHashMap.put(short[].class, a.f12188c);
        concurrentHashMap.put(Short[].class, a.f12189d);
        concurrentHashMap.put(long[].class, a.f12196k);
        concurrentHashMap.put(Long[].class, a.f12197l);
        concurrentHashMap.put(byte[].class, a.f12192g);
        concurrentHashMap.put(Byte[].class, a.f12193h);
        concurrentHashMap.put(char[].class, a.f12194i);
        concurrentHashMap.put(Character[].class, a.f12195j);
        concurrentHashMap.put(float[].class, a.f12198m);
        concurrentHashMap.put(Float[].class, a.f12199n);
        concurrentHashMap.put(double[].class, a.f12200o);
        concurrentHashMap.put(Double[].class, a.f12201p);
        concurrentHashMap.put(boolean[].class, a.f12202q);
        concurrentHashMap.put(Boolean[].class, a.f12203r);
        this.f12206b = new c(this);
        this.f12207c = new d(this);
        concurrentHashMap.put(T1.c.class, this.f12206b);
        concurrentHashMap.put(T1.b.class, this.f12206b);
        concurrentHashMap.put(T1.a.class, this.f12206b);
        concurrentHashMap.put(T1.d.class, this.f12206b);
    }
}
