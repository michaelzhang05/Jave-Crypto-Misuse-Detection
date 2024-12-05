package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import e.h.a.k0.f;
import java.util.List;

/* compiled from: ConnectionModel.java */
/* loaded from: classes2.dex */
public class a {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f17194b;

    /* renamed from: c, reason: collision with root package name */
    private long f17195c;

    /* renamed from: d, reason: collision with root package name */
    private long f17196d;

    /* renamed from: e, reason: collision with root package name */
    private long f17197e;

    public static long f(List<a> list) {
        long j2 = 0;
        for (a aVar : list) {
            j2 += aVar.a() - aVar.e();
        }
        return j2;
    }

    public long a() {
        return this.f17196d;
    }

    public long b() {
        return this.f17197e;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.f17194b;
    }

    public long e() {
        return this.f17195c;
    }

    public void g(long j2) {
        this.f17196d = j2;
    }

    public void h(long j2) {
        this.f17197e = j2;
    }

    public void i(int i2) {
        this.a = i2;
    }

    public void j(int i2) {
        this.f17194b = i2;
    }

    public void k(long j2) {
        this.f17195c = j2;
    }

    public ContentValues l() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, Integer.valueOf(this.a));
        contentValues.put("connectionIndex", Integer.valueOf(this.f17194b));
        contentValues.put("startOffset", Long.valueOf(this.f17195c));
        contentValues.put("currentOffset", Long.valueOf(this.f17196d));
        contentValues.put("endOffset", Long.valueOf(this.f17197e));
        return contentValues;
    }

    public String toString() {
        return f.o("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.a), Integer.valueOf(this.f17194b), Long.valueOf(this.f17195c), Long.valueOf(this.f17197e), Long.valueOf(this.f17196d));
    }
}
