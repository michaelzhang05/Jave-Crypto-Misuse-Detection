package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p1.C3596a;
import p1.EnumC3597b;
import p1.c;

/* loaded from: classes3.dex */
final class SqlDateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f17780b = new r() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f17781a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(C3596a c3596a) {
        java.util.Date parse;
        if (c3596a.N() == EnumC3597b.NULL) {
            c3596a.J();
            return null;
        }
        String L8 = c3596a.L();
        try {
            synchronized (this) {
                parse = this.f17781a.parse(L8);
            }
            return new Date(parse.getTime());
        } catch (ParseException e8) {
            throw new m("Failed parsing '" + L8 + "' as SQL Date; at path " + c3596a.r(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.x();
            return;
        }
        synchronized (this) {
            format = this.f17781a.format((java.util.Date) date);
        }
        cVar.Q(format);
    }

    private SqlDateTypeAdapter() {
        this.f17781a = new SimpleDateFormat("MMM d, yyyy");
    }
}
