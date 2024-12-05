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
import s1.C3990a;
import s1.EnumC3991b;
import s1.c;

/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f18837b = new r() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f18838a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(C3990a c3990a) {
        Time time;
        if (c3990a.N() == EnumC3991b.NULL) {
            c3990a.J();
            return null;
        }
        String L8 = c3990a.L();
        try {
            synchronized (this) {
                time = new Time(this.f18838a.parse(L8).getTime());
            }
            return time;
        } catch (ParseException e8) {
            throw new m("Failed parsing '" + L8 + "' as SQL Time; at path " + c3990a.u(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.A();
            return;
        }
        synchronized (this) {
            format = this.f18838a.format((Date) time);
        }
        cVar.Q(format);
    }

    private SqlTimeTypeAdapter() {
        this.f18838a = new SimpleDateFormat("hh:mm:ss a");
    }
}
