package com.google.gson.t.n;

import com.google.gson.JsonSyntaxException;
import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* loaded from: classes2.dex */
public final class k extends q<Time> {
    public static final r a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f16949b = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    /* loaded from: classes2.dex */
    static class a implements r {
        a() {
        }

        @Override // com.google.gson.r
        public <T> q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // com.google.gson.q
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.x0() == com.google.gson.stream.b.NULL) {
            aVar.t0();
            return null;
        }
        try {
            return new Time(this.f16949b.parse(aVar.v0()).getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(com.google.gson.stream.c cVar, Time time) throws IOException {
        cVar.A0(time == null ? null : this.f16949b.format((Date) time));
    }
}
