package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.C2302z2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    private C2302z2 f17649a;

    /* renamed from: b, reason: collision with root package name */
    private Long f17650b;

    /* renamed from: c, reason: collision with root package name */
    private long f17651c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ g6 f17652d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2302z2 a(String str, C2302z2 c2302z2) {
        boolean z8;
        Object obj;
        String U8 = c2302z2.U();
        List V7 = c2302z2.V();
        this.f17652d.l();
        Long l8 = (Long) W5.g0(c2302z2, "_eid");
        if (l8 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 && U8.equals("_ep")) {
            AbstractC1400p.l(l8);
            this.f17652d.l();
            U8 = (String) W5.g0(c2302z2, "_en");
            if (TextUtils.isEmpty(U8)) {
                this.f17652d.c().I().b("Extra parameter without an event name. eventId", l8);
                return null;
            }
            if (this.f17649a == null || this.f17650b == null || l8.longValue() != this.f17650b.longValue()) {
                Pair H8 = this.f17652d.n().H(str, l8);
                if (H8 != null && (obj = H8.first) != null) {
                    this.f17649a = (C2302z2) obj;
                    this.f17651c = ((Long) H8.second).longValue();
                    this.f17652d.l();
                    this.f17650b = (Long) W5.g0(this.f17649a, "_eid");
                } else {
                    this.f17652d.c().I().c("Extra parameter without existing main event. eventName, eventId", U8, l8);
                    return null;
                }
            }
            long j8 = this.f17651c - 1;
            this.f17651c = j8;
            if (j8 <= 0) {
                C2392m n8 = this.f17652d.n();
                n8.k();
                n8.c().K().b("Clearing complex main event info. appId", str);
                try {
                    n8.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e8) {
                    n8.c().G().b("Error clearing complex main event", e8);
                }
            } else {
                this.f17652d.n().n0(str, l8, this.f17651c, this.f17649a);
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.B2 b22 : this.f17649a.V()) {
                this.f17652d.l();
                if (W5.F(c2302z2, b22.W()) == null) {
                    arrayList.add(b22);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(V7);
                V7 = arrayList;
            } else {
                this.f17652d.c().I().b("No unique parameters in main event. eventName", U8);
            }
        } else if (z8) {
            this.f17650b = l8;
            this.f17649a = c2302z2;
            this.f17652d.l();
            long longValue = ((Long) W5.J(c2302z2, "_epc", 0L)).longValue();
            this.f17651c = longValue;
            if (longValue <= 0) {
                this.f17652d.c().I().b("Complex event with zero extra param count. eventName", U8);
            } else {
                this.f17652d.n().n0(str, (Long) AbstractC1400p.l(l8), this.f17651c, c2302z2);
            }
        }
        return (C2302z2) ((AbstractC2091c5) ((C2302z2.a) c2302z2.x()).z(U8).E().x(V7).k());
    }

    private i6(g6 g6Var) {
        this.f17652d = g6Var;
    }
}
