package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
class j implements h {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f862b;

    /* renamed from: c, reason: collision with root package name */
    private final i.d f863c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f864d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f865e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f866f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f867g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f868h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f869i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i.d dVar) {
        Icon icon;
        List list;
        List<String> e2;
        this.f863c = dVar;
        this.a = dVar.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f862b = new Notification.Builder(dVar.a, dVar.K);
        } else {
            this.f862b = new Notification.Builder(dVar.a);
        }
        Notification notification = dVar.S;
        this.f862b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f856i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f852e).setContentText(dVar.f853f).setContentInfo(dVar.f858k).setContentIntent(dVar.f854g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f855h, (notification.flags & 128) != 0).setLargeIcon(dVar.f857j).setNumber(dVar.l).setProgress(dVar.t, dVar.u, dVar.v);
        if (i2 < 21) {
            this.f862b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f862b.setSubText(dVar.q).setUsesChronometer(dVar.o).setPriority(dVar.m);
            Iterator<i.a> it = dVar.f849b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = dVar.D;
            if (bundle != null) {
                this.f867g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.z) {
                    this.f867g.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.w;
                if (str != null) {
                    this.f867g.putString("android.support.groupKey", str);
                    if (dVar.x) {
                        this.f867g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f867g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.y;
                if (str2 != null) {
                    this.f867g.putString("android.support.sortKey", str2);
                }
            }
            this.f864d = dVar.H;
            this.f865e = dVar.I;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f862b.setShowWhen(dVar.n);
        }
        if (i3 >= 19 && i3 < 21 && (e2 = e(f(dVar.f850c), dVar.V)) != null && !e2.isEmpty()) {
            this.f867g.putStringArray("android.people", (String[]) e2.toArray(new String[e2.size()]));
        }
        if (i3 >= 20) {
            this.f862b.setLocalOnly(dVar.z).setGroup(dVar.w).setGroupSummary(dVar.x).setSortKey(dVar.y);
            this.f868h = dVar.P;
        }
        if (i3 >= 21) {
            this.f862b.setCategory(dVar.C).setColor(dVar.E).setVisibility(dVar.F).setPublicVersion(dVar.G).setSound(notification.sound, notification.audioAttributes);
            if (i3 < 28) {
                list = e(f(dVar.f850c), dVar.V);
            } else {
                list = dVar.V;
            }
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.f862b.addPerson((String) it2.next());
                }
            }
            this.f869i = dVar.J;
            if (dVar.f851d.size() > 0) {
                Bundle bundle2 = dVar.d().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < dVar.f851d.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), k.b(dVar.f851d.get(i4)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.d().putBundle("android.car.EXTENSIONS", bundle2);
                this.f867g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = dVar.U) != null) {
            this.f862b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f862b.setExtras(dVar.D).setRemoteInputHistory(dVar.s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                this.f862b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                this.f862b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                this.f862b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f862b.setBadgeIconType(dVar.L).setSettingsText(dVar.r).setShortcutId(dVar.M).setTimeoutAfter(dVar.O).setGroupAlertBehavior(dVar.P);
            if (dVar.B) {
                this.f862b.setColorized(dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.f862b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<m> it3 = dVar.f850c.iterator();
            while (it3.hasNext()) {
                this.f862b.addPerson(it3.next().h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f862b.setAllowSystemGeneratedContextualActions(dVar.Q);
            this.f862b.setBubbleMetadata(i.c.a(dVar.R));
            if (dVar.N != null) {
                throw null;
            }
        }
        if (dVar.T) {
            if (this.f863c.x) {
                this.f868h = 2;
            } else {
                this.f868h = 1;
            }
            this.f862b.setVibrate(null);
            this.f862b.setSound(null);
            int i7 = notification.defaults & (-2);
            notification.defaults = i7;
            int i8 = i7 & (-3);
            notification.defaults = i8;
            this.f862b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f863c.w)) {
                    this.f862b.setGroup("silent");
                }
                this.f862b.setGroupAlertBehavior(this.f868h);
            }
        }
    }

    private void b(i.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 20) {
            if (i2 >= 16) {
                this.f866f.add(k.f(this.f862b, aVar));
                return;
            }
            return;
        }
        IconCompat e2 = aVar.e();
        if (i2 >= 23) {
            builder = new Notification.Action.Builder(e2 != null ? e2.n() : null, aVar.i(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(e2 != null ? e2.c() : 0, aVar.i(), aVar.a());
        }
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : n.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i3 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i3 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f862b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        c.e.b bVar = new c.e.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & (-2);
        notification.defaults = i2;
        notification.defaults = i2 & (-3);
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.f862b;
    }

    public Notification c() {
        Bundle a;
        RemoteViews f2;
        RemoteViews d2;
        i.e eVar = this.f863c.p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews e2 = eVar != null ? eVar.e(this) : null;
        Notification d3 = d();
        if (e2 != null) {
            d3.contentView = e2;
        } else {
            RemoteViews remoteViews = this.f863c.H;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && eVar != null && (d2 = eVar.d(this)) != null) {
            d3.bigContentView = d2;
        }
        if (i2 >= 21 && eVar != null && (f2 = this.f863c.p.f(this)) != null) {
            d3.headsUpContentView = f2;
        }
        if (i2 >= 16 && eVar != null && (a = i.a(d3)) != null) {
            eVar.a(a);
        }
        return d3;
    }

    protected Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.f862b.build();
        }
        if (i2 >= 24) {
            Notification build = this.f862b.build();
            if (this.f868h != 0) {
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f868h == 2) {
                    g(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f868h == 1) {
                    g(build);
                }
            }
            return build;
        }
        if (i2 >= 21) {
            this.f862b.setExtras(this.f867g);
            Notification build2 = this.f862b.build();
            RemoteViews remoteViews = this.f864d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f865e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f869i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f868h != 0) {
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f868h == 2) {
                    g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f868h == 1) {
                    g(build2);
                }
            }
            return build2;
        }
        if (i2 >= 20) {
            this.f862b.setExtras(this.f867g);
            Notification build3 = this.f862b.build();
            RemoteViews remoteViews4 = this.f864d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f865e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f868h != 0) {
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f868h == 2) {
                    g(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f868h == 1) {
                    g(build3);
                }
            }
            return build3;
        }
        if (i2 >= 19) {
            SparseArray<Bundle> a = k.a(this.f866f);
            if (a != null) {
                this.f867g.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f862b.setExtras(this.f867g);
            Notification build4 = this.f862b.build();
            RemoteViews remoteViews6 = this.f864d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f865e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        }
        if (i2 >= 16) {
            Notification build5 = this.f862b.build();
            Bundle a2 = i.a(build5);
            Bundle bundle = new Bundle(this.f867g);
            for (String str : this.f867g.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = k.a(this.f866f);
            if (a3 != null) {
                i.a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f864d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f865e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
        return this.f862b.getNotification();
    }
}
