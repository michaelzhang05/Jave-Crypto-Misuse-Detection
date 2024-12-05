package androidx.work.impl.n;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<j> f2012b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<j> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, j jVar) {
            String str = jVar.a;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            String str2 = jVar.f2011b;
            if (str2 == null) {
                fVar.a0(2);
            } else {
                fVar.m(2, str2);
            }
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public l(androidx.room.j jVar) {
        this.a = jVar;
        this.f2012b = new a(jVar);
    }

    @Override // androidx.work.impl.n.k
    public void a(j jVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2012b.insert((androidx.room.c<j>) jVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.k
    public List<String> b(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
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
}
