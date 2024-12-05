package cm.aptoide.pt.database.room;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.c;
import androidx.room.j;
import androidx.room.n;
import c.q.a.f;
import h.a.m;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class AppComingSoonRegistrationDAO_Impl implements AppComingSoonRegistrationDAO {
    private final j __db;
    private final b<RoomAppComingSoonRegistration> __deletionAdapterOfRoomAppComingSoonRegistration;
    private final c<RoomAppComingSoonRegistration> __insertionAdapterOfRoomAppComingSoonRegistration;

    public AppComingSoonRegistrationDAO_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomAppComingSoonRegistration = new c<RoomAppComingSoonRegistration>(jVar) { // from class: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl.1
            @Override // androidx.room.q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `appComingSoonRegistration` (`packageName`) VALUES (?)";
            }

            @Override // androidx.room.c
            public void bind(f fVar, RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
                if (roomAppComingSoonRegistration.getPackageName() == null) {
                    fVar.a0(1);
                } else {
                    fVar.m(1, roomAppComingSoonRegistration.getPackageName());
                }
            }
        };
        this.__deletionAdapterOfRoomAppComingSoonRegistration = new b<RoomAppComingSoonRegistration>(jVar) { // from class: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl.2
            @Override // androidx.room.b, androidx.room.q
            public String createQuery() {
                return "DELETE FROM `appComingSoonRegistration` WHERE `packageName` = ?";
            }

            @Override // androidx.room.b
            public void bind(f fVar, RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
                if (roomAppComingSoonRegistration.getPackageName() == null) {
                    fVar.a0(1);
                } else {
                    fVar.m(1, roomAppComingSoonRegistration.getPackageName());
                }
            }
        };
    }

    @Override // cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO
    public m<Integer> isRegisteredForApp(String str) {
        final androidx.room.m f2 = androidx.room.m.f("SELECT COUNT(*) from appComingSoonRegistration where packageName like ?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        return n.a(this.__db, false, new String[]{"appComingSoonRegistration"}, new Callable<Integer>() { // from class: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl.3
            protected void finalize() {
                f2.z();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer num = null;
                Cursor b2 = androidx.room.t.c.b(AppComingSoonRegistrationDAO_Impl.this.__db, f2, false, null);
                try {
                    if (b2.moveToFirst() && !b2.isNull(0)) {
                        num = Integer.valueOf(b2.getInt(0));
                    }
                    return num;
                } finally {
                    b2.close();
                }
            }
        });
    }

    @Override // cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO
    public void remove(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomAppComingSoonRegistration.handle(roomAppComingSoonRegistration);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO
    public void save(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomAppComingSoonRegistration.insert((c<RoomAppComingSoonRegistration>) roomAppComingSoonRegistration);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
