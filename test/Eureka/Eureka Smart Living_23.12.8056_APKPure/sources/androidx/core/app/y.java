package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.t;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y implements s {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2005a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f2006b;

    /* renamed from: c, reason: collision with root package name */
    private final t.e f2007c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f2008d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f2009e;

    /* renamed from: f, reason: collision with root package name */
    private final List f2010f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f2011g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f2012h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f2013i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i6) {
            return builder.setPriority(i6);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z5) {
            return builder.setUsesChronometer(z5);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z5) {
            return builder.setShowWhen(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i6, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i6, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z5) {
            return builder.setGroupSummary(z5);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z5) {
            return builder.setLocalOnly(z5);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i6) {
            return builder.setColor(i6);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i6) {
            return builder.setVisibility(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            a0.a();
            return z.a(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            Notification.Builder smallIcon;
            smallIcon = builder.setSmallIcon(b0.a(obj));
            return smallIcon;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z5) {
            Notification.Action.Builder allowGeneratedReplies;
            allowGeneratedReplies = builder.setAllowGeneratedReplies(z5);
            return allowGeneratedReplies;
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customBigContentView;
            customBigContentView = builder.setCustomBigContentView(remoteViews);
            return customBigContentView;
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customContentView;
            customContentView = builder.setCustomContentView(remoteViews);
            return customContentView;
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customHeadsUpContentView;
            customHeadsUpContentView = builder.setCustomHeadsUpContentView(remoteViews);
            return customHeadsUpContentView;
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            Notification.Builder remoteInputHistory;
            remoteInputHistory = builder.setRemoteInputHistory(charSequenceArr);
            return remoteInputHistory;
        }
    }

    /* loaded from: classes.dex */
    static class h {
        static Notification.Builder a(Context context, String str) {
            j0.a();
            return i0.a(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i6) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i6);
            return badgeIconType;
        }

        static Notification.Builder c(Notification.Builder builder, boolean z5) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z5);
            return colorized;
        }

        static Notification.Builder d(Notification.Builder builder, int i6) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i6);
            return groupAlertBehavior;
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        static Notification.Builder g(Notification.Builder builder, long j6) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j6);
            return timeoutAfter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i6) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i6);
            return semanticAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z5) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z5);
            return allowSystemGeneratedContextualActions;
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z5) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z5);
            return contextual;
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId(v0.a(obj));
            return locusId;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z5) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z5);
            return authenticationRequired;
        }

        static Notification.Builder b(Notification.Builder builder, int i6) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i6);
            return foregroundServiceBehavior;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(t.e eVar) {
        int i6;
        Object obj;
        this.f2007c = eVar;
        Context context = eVar.f1975a;
        this.f2005a = context;
        this.f2006b = Build.VERSION.SDK_INT >= 26 ? h.a(context, eVar.K) : new Notification.Builder(eVar.f1975a);
        Notification notification = eVar.R;
        this.f2006b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1983i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1979e).setContentText(eVar.f1980f).setContentInfo(eVar.f1985k).setContentIntent(eVar.f1981g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1982h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1984j).setNumber(eVar.f1986l).setProgress(eVar.f1994t, eVar.f1995u, eVar.f1996v);
        a.b(a.d(a.c(this.f2006b, eVar.f1991q), eVar.f1989o), eVar.f1987m);
        Iterator it = eVar.f1976b.iterator();
        while (it.hasNext()) {
            b((t.a) it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f2011g.putAll(bundle);
        }
        int i7 = Build.VERSION.SDK_INT;
        this.f2008d = eVar.H;
        this.f2009e = eVar.I;
        b.a(this.f2006b, eVar.f1988n);
        d.i(this.f2006b, eVar.f2000z);
        d.g(this.f2006b, eVar.f1997w);
        d.j(this.f2006b, eVar.f1999y);
        d.h(this.f2006b, eVar.f1998x);
        this.f2012h = eVar.O;
        e.b(this.f2006b, eVar.C);
        e.c(this.f2006b, eVar.E);
        e.f(this.f2006b, eVar.F);
        e.d(this.f2006b, eVar.G);
        e.e(this.f2006b, notification.sound, notification.audioAttributes);
        List e6 = i7 < 28 ? e(g(eVar.f1977c), eVar.U) : eVar.U;
        if (e6 != null && !e6.isEmpty()) {
            Iterator it2 = e6.iterator();
            while (it2.hasNext()) {
                e.a(this.f2006b, (String) it2.next());
            }
        }
        this.f2013i = eVar.J;
        if (eVar.f1978d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i8 = 0; i8 < eVar.f1978d.size(); i8++) {
                bundle4.putBundle(Integer.toString(i8), z0.a((t.a) eVar.f1978d.get(i8)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f2011g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23 && (obj = eVar.T) != null) {
            f.b(this.f2006b, obj);
        }
        if (i9 >= 24) {
            c.a(this.f2006b, eVar.D);
            g.e(this.f2006b, eVar.f1993s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                g.c(this.f2006b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                g.b(this.f2006b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                g.d(this.f2006b, remoteViews3);
            }
        }
        if (i9 >= 26) {
            h.b(this.f2006b, eVar.L);
            h.e(this.f2006b, eVar.f1992r);
            h.f(this.f2006b, eVar.M);
            h.g(this.f2006b, eVar.N);
            h.d(this.f2006b, eVar.O);
            if (eVar.B) {
                h.c(this.f2006b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f2006b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            Iterator it3 = eVar.f1977c.iterator();
            if (it3.hasNext()) {
                androidx.appcompat.app.f0.a(it3.next());
                throw null;
            }
        }
        if (i9 >= 29) {
            j.a(this.f2006b, eVar.Q);
            j.b(this.f2006b, t.d.a(null));
        }
        if (i9 >= 31 && (i6 = eVar.P) != 0) {
            k.b(this.f2006b, i6);
        }
        if (eVar.S) {
            if (this.f2007c.f1998x) {
                this.f2012h = 2;
            } else {
                this.f2012h = 1;
            }
            this.f2006b.setVibrate(null);
            this.f2006b.setSound(null);
            int i10 = notification.defaults & (-2) & (-3);
            notification.defaults = i10;
            this.f2006b.setDefaults(i10);
            if (i9 >= 26) {
                if (TextUtils.isEmpty(this.f2007c.f1997w)) {
                    d.g(this.f2006b, "silent");
                }
                h.d(this.f2006b, this.f2012h);
            }
        }
    }

    private void b(t.a aVar) {
        int i6 = Build.VERSION.SDK_INT;
        IconCompat d6 = aVar.d();
        Notification.Action.Builder a6 = i6 >= 23 ? f.a(d6 != null ? d6.l() : null, aVar.h(), aVar.a()) : d.e(d6 != null ? d6.e() : 0, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : g1.b(aVar.e())) {
                d.c(a6, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            g.a(a6, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i7 >= 28) {
            i.b(a6, aVar.f());
        }
        if (i7 >= 29) {
            j.c(a6, aVar.j());
        }
        if (i7 >= 31) {
            k.a(a6, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a6, bundle);
        d.a(this.f2006b, d.d(a6));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        l.b bVar = new l.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        androidx.appcompat.app.f0.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.s
    public Notification.Builder a() {
        return this.f2006b;
    }

    public Notification c() {
        Bundle a6;
        RemoteViews f6;
        RemoteViews d6;
        t.f fVar = this.f2007c.f1990p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e6 = fVar != null ? fVar.e(this) : null;
        Notification d7 = d();
        if (e6 != null || (e6 = this.f2007c.H) != null) {
            d7.contentView = e6;
        }
        if (fVar != null && (d6 = fVar.d(this)) != null) {
            d7.bigContentView = d6;
        }
        if (fVar != null && (f6 = this.f2007c.f1990p.f(this)) != null) {
            d7.headsUpContentView = f6;
        }
        if (fVar != null && (a6 = t.a(d7)) != null) {
            fVar.a(a6);
        }
        return d7;
    }

    protected Notification d() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            return a.a(this.f2006b);
        }
        if (i6 >= 24) {
            Notification a6 = a.a(this.f2006b);
            if (this.f2012h != 0) {
                if (d.f(a6) != null && (a6.flags & 512) != 0 && this.f2012h == 2) {
                    h(a6);
                }
                if (d.f(a6) != null && (a6.flags & 512) == 0 && this.f2012h == 1) {
                    h(a6);
                }
            }
            return a6;
        }
        c.a(this.f2006b, this.f2011g);
        Notification a7 = a.a(this.f2006b);
        RemoteViews remoteViews = this.f2008d;
        if (remoteViews != null) {
            a7.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f2009e;
        if (remoteViews2 != null) {
            a7.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f2013i;
        if (remoteViews3 != null) {
            a7.headsUpContentView = remoteViews3;
        }
        if (this.f2012h != 0) {
            if (d.f(a7) != null && (a7.flags & 512) != 0 && this.f2012h == 2) {
                h(a7);
            }
            if (d.f(a7) != null && (a7.flags & 512) == 0 && this.f2012h == 1) {
                h(a7);
            }
        }
        return a7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f2005a;
    }
}
