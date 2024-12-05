package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GraphRequestBatch.java */
/* loaded from: classes.dex */
public class h extends AbstractList<GraphRequest> {

    /* renamed from: f, reason: collision with root package name */
    private static AtomicInteger f9089f = new AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    private Handler f9090g;

    /* renamed from: h, reason: collision with root package name */
    private List<GraphRequest> f9091h;

    /* renamed from: i, reason: collision with root package name */
    private int f9092i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final String f9093j = Integer.valueOf(f9089f.incrementAndGet()).toString();

    /* renamed from: k, reason: collision with root package name */
    private List<a> f9094k = new ArrayList();
    private String l;

    /* compiled from: GraphRequestBatch.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(h hVar);
    }

    /* compiled from: GraphRequestBatch.java */
    /* loaded from: classes.dex */
    public interface b extends a {
        void b(h hVar, long j2, long j3);
    }

    public h(Collection<GraphRequest> collection) {
        this.f9091h = new ArrayList();
        this.f9091h = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final GraphRequest get(int i2) {
        return this.f9091h.get(i2);
    }

    public final String J() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Handler K() {
        return this.f9090g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<a> L() {
        return this.f9094k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String M() {
        return this.f9093j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<GraphRequest> N() {
        return this.f9091h;
    }

    public int O() {
        return this.f9092i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final GraphRequest remove(int i2) {
        return this.f9091h.remove(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final GraphRequest set(int i2, GraphRequest graphRequest) {
        return this.f9091h.set(i2, graphRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(Handler handler) {
        this.f9090g = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void add(int i2, GraphRequest graphRequest) {
        this.f9091h.add(i2, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(GraphRequest graphRequest) {
        return this.f9091h.add(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f9091h.clear();
    }

    public void f(a aVar) {
        if (this.f9094k.contains(aVar)) {
            return;
        }
        this.f9094k.add(aVar);
    }

    public final List<i> o() {
        return w();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9091h.size();
    }

    List<i> w() {
        return GraphRequest.j(this);
    }

    public final g x() {
        return z();
    }

    g z() {
        return GraphRequest.m(this);
    }

    public h(GraphRequest... graphRequestArr) {
        this.f9091h = new ArrayList();
        this.f9091h = Arrays.asList(graphRequestArr);
    }
}
