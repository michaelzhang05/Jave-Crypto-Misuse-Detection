package cm.aptoide.pt.database.room;

import android.database.Cursor;
import androidx.room.c;
import androidx.room.j;
import androidx.room.n;
import androidx.room.t.b;
import c.q.a.f;
import h.a.m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class InstallationDao_Impl implements InstallationDao {
    private final j __db;
    private final c<RoomInstallation> __insertionAdapterOfRoomInstallation;

    public InstallationDao_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomInstallation = new c<RoomInstallation>(jVar) { // from class: cm.aptoide.pt.database.room.InstallationDao_Impl.1
            @Override // androidx.room.q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `installation` (`packageName`,`icon`,`name`,`versionCode`,`versionName`) VALUES (?,?,?,?,?)";
            }

            @Override // androidx.room.c
            public void bind(f fVar, RoomInstallation roomInstallation) {
                if (roomInstallation.getPackageName() == null) {
                    fVar.a0(1);
                } else {
                    fVar.m(1, roomInstallation.getPackageName());
                }
                if (roomInstallation.getIcon() == null) {
                    fVar.a0(2);
                } else {
                    fVar.m(2, roomInstallation.getIcon());
                }
                if (roomInstallation.getName() == null) {
                    fVar.a0(3);
                } else {
                    fVar.m(3, roomInstallation.getName());
                }
                fVar.F(4, roomInstallation.getVersionCode());
                if (roomInstallation.getVersionName() == null) {
                    fVar.a0(5);
                } else {
                    fVar.m(5, roomInstallation.getVersionName());
                }
            }
        };
    }

    @Override // cm.aptoide.pt.database.room.InstallationDao
    public m<List<RoomInstallation>> getAll() {
        final androidx.room.m f2 = androidx.room.m.f("SELECT * FROM installation", 0);
        return n.a(this.__db, false, new String[]{"installation"}, new Callable<List<RoomInstallation>>() { // from class: cm.aptoide.pt.database.room.InstallationDao_Impl.2
            protected void finalize() {
                f2.z();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomInstallation> call() throws Exception {
                Cursor b2 = androidx.room.t.c.b(InstallationDao_Impl.this.__db, f2, false, null);
                try {
                    int b3 = b.b(b2, "packageName");
                    int b4 = b.b(b2, RoomInstalled.ICON);
                    int b5 = b.b(b2, "name");
                    int b6 = b.b(b2, RoomInstalled.VERSION_CODE);
                    int b7 = b.b(b2, RoomInstalled.VERSION_NAME);
                    ArrayList arrayList = new ArrayList(b2.getCount());
                    while (b2.moveToNext()) {
                        arrayList.add(new RoomInstallation(b2.getString(b3), b2.getString(b5), b2.getString(b4), b2.getInt(b6), b2.getString(b7)));
                    }
                    return arrayList;
                } finally {
                    b2.close();
                }
            }
        });
    }

    @Override // cm.aptoide.pt.database.room.InstallationDao
    public void insert(RoomInstallation roomInstallation) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstallation.insert((c<RoomInstallation>) roomInstallation);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.pt.database.room.InstallationDao
    public void insertAll(List<RoomInstallation> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstallation.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
