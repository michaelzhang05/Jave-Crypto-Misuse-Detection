package androidx.work.impl.n;

import android.database.Cursor;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<d> f2007b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<d> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, d dVar) {
            String str = dVar.a;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            Long l = dVar.f2006b;
            if (l == null) {
                fVar.a0(2);
            } else {
                fVar.F(2, l.longValue());
            }
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public f(androidx.room.j jVar) {
        this.a = jVar;
        this.f2007b = new a(jVar);
    }

    @Override // androidx.work.impl.n.e
    public Long a(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Long l = null;
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            if (b2.moveToFirst() && !b2.isNull(0)) {
                l = Long.valueOf(b2.getLong(0));
            }
            return l;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.e
    public void b(d dVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2007b.insert((androidx.room.c<d>) dVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
