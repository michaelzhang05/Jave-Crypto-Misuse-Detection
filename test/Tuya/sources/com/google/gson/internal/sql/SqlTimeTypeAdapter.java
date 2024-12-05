package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p1.C3596a;
import p1.EnumC3597b;
import p1.c;

/* loaded from: classes3.dex */
final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f17782b = new r() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f17783a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(C3596a c3596a) {
        Time time;
        if (c3596a.N() == EnumC3597b.NULL) {
            c3596a.J();
            return null;
        }
        String L8 = c3596a.L();
        try {
            synchronized (this) {
                time = new Time(this.f17783a.parse(L8).getTime());
            }
            return time;
        } catch (ParseException e8) {
            throw new m("Failed parsing '" + L8 + "' as SQL Time; at path " + c3596a.r(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.x();
            return;
        }
        synchronized (this) {
            format = this.f17783a.format((Date) time);
        }
        cVar.Q(format);
    }

    private SqlTimeTypeAdapter() {
        this.f17783a = new SimpleDateFormat("hh:mm:ss a");
    }
}
