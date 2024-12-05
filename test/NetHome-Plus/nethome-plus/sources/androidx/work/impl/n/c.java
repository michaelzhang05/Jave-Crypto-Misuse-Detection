package androidx.work.impl.n;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<androidx.work.impl.n.a> f2005b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<androidx.work.impl.n.a> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, androidx.work.impl.n.a aVar) {
            String str = aVar.a;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            String str2 = aVar.f2004b;
            if (str2 == null) {
                fVar.a0(2);
            } else {
                fVar.m(2, str2);
            }
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(androidx.room.j jVar) {
        this.a = jVar;
        this.f2005b = new a(jVar);
    }

    @Override // androidx.work.impl.n.b
    public void a(androidx.work.impl.n.a aVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2005b.insert((androidx.room.c<androidx.work.impl.n.a>) aVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.b
    public List<String> b(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    @Override // androidx.work.impl.n.b
    public boolean c(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            if (b2.moveToFirst()) {
                z = b2.getInt(0) != 0;
            }
            return z;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.b
    public boolean d(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            if (b2.moveToFirst()) {
                z = b2.getInt(0) != 0;
            }
            return z;
        } finally {
            b2.close();
            f2.z();
        }
    }
}
