package androidx.room;

import android.database.Cursor;
import c.q.a.c;
import java.util.Iterator;
import java.util.List;

/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public class l extends c.a {

    /* renamed from: b, reason: collision with root package name */
    private androidx.room.a f1674b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1675c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1676d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1677e;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int version;

        public a(int i2) {
            this.version = i2;
        }

        protected abstract void createAllTables(c.q.a.b bVar);

        protected abstract void dropAllTables(c.q.a.b bVar);

        protected abstract void onCreate(c.q.a.b bVar);

        protected abstract void onOpen(c.q.a.b bVar);

        protected abstract void onPostMigrate(c.q.a.b bVar);

        protected abstract void onPreMigrate(c.q.a.b bVar);

        protected abstract b onValidateSchema(c.q.a.b bVar);

        @Deprecated
        protected void validateMigration(c.q.a.b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1678b;

        public b(boolean z, String str) {
            this.a = z;
            this.f1678b = str;
        }
    }

    public l(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.version);
        this.f1674b = aVar;
        this.f1675c = aVar2;
        this.f1676d = str;
        this.f1677e = str2;
    }

    private void h(c.q.a.b bVar) {
        if (k(bVar)) {
            Cursor Z = bVar.Z(new c.q.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = Z.moveToFirst() ? Z.getString(0) : null;
                Z.close();
                if (!this.f1676d.equals(string) && !this.f1677e.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th) {
                Z.close();
                throw th;
            }
        }
        b onValidateSchema = this.f1675c.onValidateSchema(bVar);
        if (onValidateSchema.a) {
            this.f1675c.onPostMigrate(bVar);
            l(bVar);
        } else {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f1678b);
        }
    }

    private void i(c.q.a.b bVar) {
        bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(c.q.a.b bVar) {
        Cursor O = bVar.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (O.moveToFirst()) {
                if (O.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            O.close();
        }
    }

    private static boolean k(c.q.a.b bVar) {
        Cursor O = bVar.O("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (O.moveToFirst()) {
                if (O.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            O.close();
        }
    }

    private void l(c.q.a.b bVar) {
        i(bVar);
        bVar.l(k.a(this.f1676d));
    }

    @Override // c.q.a.c.a
    public void b(c.q.a.b bVar) {
        super.b(bVar);
    }

    @Override // c.q.a.c.a
    public void d(c.q.a.b bVar) {
        boolean j2 = j(bVar);
        this.f1675c.createAllTables(bVar);
        if (!j2) {
            b onValidateSchema = this.f1675c.onValidateSchema(bVar);
            if (!onValidateSchema.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f1678b);
            }
        }
        l(bVar);
        this.f1675c.onCreate(bVar);
    }

    @Override // c.q.a.c.a
    public void e(c.q.a.b bVar, int i2, int i3) {
        g(bVar, i2, i3);
    }

    @Override // c.q.a.c.a
    public void f(c.q.a.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f1675c.onOpen(bVar);
        this.f1674b = null;
    }

    @Override // c.q.a.c.a
    public void g(c.q.a.b bVar, int i2, int i3) {
        boolean z;
        List<androidx.room.s.a> c2;
        androidx.room.a aVar = this.f1674b;
        if (aVar == null || (c2 = aVar.f1613d.c(i2, i3)) == null) {
            z = false;
        } else {
            this.f1675c.onPreMigrate(bVar);
            Iterator<androidx.room.s.a> it = c2.iterator();
            while (it.hasNext()) {
                it.next().migrate(bVar);
            }
            b onValidateSchema = this.f1675c.onValidateSchema(bVar);
            if (onValidateSchema.a) {
                this.f1675c.onPostMigrate(bVar);
                l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f1678b);
            }
        }
        if (z) {
            return;
        }
        androidx.room.a aVar2 = this.f1674b;
        if (aVar2 != null && !aVar2.a(i2, i3)) {
            this.f1675c.dropAllTables(bVar);
            this.f1675c.createAllTables(bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
