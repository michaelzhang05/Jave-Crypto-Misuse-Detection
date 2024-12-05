package androidx.work.impl.n;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<s> f2038b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<s> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, s sVar) {
            String str = sVar.a;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            String str2 = sVar.f2037b;
            if (str2 == null) {
                fVar.a0(2);
            } else {
                fVar.m(2, str2);
            }
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public u(androidx.room.j jVar) {
        this.a = jVar;
        this.f2038b = new a(jVar);
    }

    @Override // androidx.work.impl.n.t
    public void a(s sVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2038b.insert((androidx.room.c<s>) sVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.t
    public List<String> b(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
