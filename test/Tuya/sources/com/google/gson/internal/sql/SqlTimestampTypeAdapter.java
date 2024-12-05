package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import p1.C3596a;
import p1.c;

/* loaded from: classes3.dex */
class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f17784b = new r() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.l(Date.class));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter f17785a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(C3596a c3596a) {
        Date date = (Date) this.f17785a.b(c3596a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Timestamp timestamp) {
        this.f17785a.d(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f17785a = typeAdapter;
    }
}
