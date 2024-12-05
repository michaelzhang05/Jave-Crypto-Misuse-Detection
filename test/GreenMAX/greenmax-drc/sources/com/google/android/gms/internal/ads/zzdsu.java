package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class zzdsu implements zzbe, Closeable, Iterator<zzbd> {

    /* renamed from: f, reason: collision with root package name */
    private static final zzbd f14972f = new hy("eof ");

    /* renamed from: g, reason: collision with root package name */
    private static zzdtc f14973g = zzdtc.b(zzdsu.class);

    /* renamed from: h, reason: collision with root package name */
    protected zzba f14974h;

    /* renamed from: i, reason: collision with root package name */
    protected zzdsw f14975i;

    /* renamed from: j, reason: collision with root package name */
    private zzbd f14976j = null;

    /* renamed from: k, reason: collision with root package name */
    long f14977k = 0;
    long l = 0;
    long m = 0;
    private List<zzbd> n = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final zzbd next() {
        zzbd a;
        zzbd zzbdVar = this.f14976j;
        if (zzbdVar != null && zzbdVar != f14972f) {
            this.f14976j = null;
            return zzbdVar;
        }
        zzdsw zzdswVar = this.f14975i;
        if (zzdswVar != null && this.f14977k < this.m) {
            try {
                synchronized (zzdswVar) {
                    this.f14975i.j0(this.f14977k);
                    a = this.f14974h.a(this.f14975i, this);
                    this.f14977k = this.f14975i.H();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.f14976j = f14972f;
        throw new NoSuchElementException();
    }

    public void close() throws IOException {
        this.f14975i.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zzbd zzbdVar = this.f14976j;
        if (zzbdVar == f14972f) {
            return false;
        }
        if (zzbdVar != null) {
            return true;
        }
        try {
            this.f14976j = (zzbd) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f14976j = f14972f;
            return false;
        }
    }

    public void o(zzdsw zzdswVar, long j2, zzba zzbaVar) throws IOException {
        this.f14975i = zzdswVar;
        long H = zzdswVar.H();
        this.l = H;
        this.f14977k = H;
        zzdswVar.j0(zzdswVar.H() + j2);
        this.m = zzdswVar.H();
        this.f14974h = zzbaVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(this.n.get(i2).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public final List<zzbd> w() {
        if (this.f14975i != null && this.f14976j != f14972f) {
            return new zzdta(this.n, this);
        }
        return this.n;
    }
}
