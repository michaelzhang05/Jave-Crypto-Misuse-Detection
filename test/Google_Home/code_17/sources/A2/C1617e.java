package a2;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1617e {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f13826a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1618f f13827b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1618f f13828c;

    public C1617e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.f13826a = concurrentHashMap;
        concurrentHashMap.put(Date.class, AbstractC1614b.f13825c);
        concurrentHashMap.put(int[].class, AbstractC1613a.f13809c);
        concurrentHashMap.put(Integer[].class, AbstractC1613a.f13810d);
        concurrentHashMap.put(short[].class, AbstractC1613a.f13809c);
        concurrentHashMap.put(Short[].class, AbstractC1613a.f13810d);
        concurrentHashMap.put(long[].class, AbstractC1613a.f13817k);
        concurrentHashMap.put(Long[].class, AbstractC1613a.f13818l);
        concurrentHashMap.put(byte[].class, AbstractC1613a.f13813g);
        concurrentHashMap.put(Byte[].class, AbstractC1613a.f13814h);
        concurrentHashMap.put(char[].class, AbstractC1613a.f13815i);
        concurrentHashMap.put(Character[].class, AbstractC1613a.f13816j);
        concurrentHashMap.put(float[].class, AbstractC1613a.f13819m);
        concurrentHashMap.put(Float[].class, AbstractC1613a.f13820n);
        concurrentHashMap.put(double[].class, AbstractC1613a.f13821o);
        concurrentHashMap.put(Double[].class, AbstractC1613a.f13822p);
        concurrentHashMap.put(boolean[].class, AbstractC1613a.f13823q);
        concurrentHashMap.put(Boolean[].class, AbstractC1613a.f13824r);
        this.f13827b = new C1615c(this);
        this.f13828c = new C1616d(this);
        concurrentHashMap.put(W1.c.class, this.f13827b);
        concurrentHashMap.put(W1.b.class, this.f13827b);
        concurrentHashMap.put(W1.a.class, this.f13827b);
        concurrentHashMap.put(W1.d.class, this.f13827b);
    }
}
