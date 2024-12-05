package androidx.work.impl.n;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<g> f2009b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.q f2010c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<g> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, g gVar) {
            String str = gVar.a;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            fVar.F(2, gVar.f2008b);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.q {
        b(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.j jVar) {
        this.a = jVar;
        this.f2009b = new a(jVar);
        this.f2010c = new b(jVar);
    }

    @Override // androidx.work.impl.n.h
    public List<String> a() {
        androidx.room.m f2 = androidx.room.m.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.h
    public void b(g gVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2009b.insert((androidx.room.c<g>) gVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.h
    public g c(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            return b2.moveToFirst() ? new g(b2.getString(androidx.room.t.b.b(b2, "work_spec_id")), b2.getInt(androidx.room.t.b.b(b2, "system_id"))) : null;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.h
    public void d(String str) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2010c.acquire();
        if (str == null) {
            acquire.a0(1);
        } else {
            acquire.m(1, str);
        }
        this.a.beginTransaction();
        try {
            acquire.p();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f2010c.release(acquire);
        }
    }
}
