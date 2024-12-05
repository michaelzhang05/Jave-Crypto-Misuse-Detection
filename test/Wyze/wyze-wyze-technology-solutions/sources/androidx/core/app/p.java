package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class p implements Iterable<Intent> {

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<Intent> f897f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Context f898g;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private p(Context context) {
        this.f898g = context;
    }

    public static p o(Context context) {
        return new p(context);
    }

    public p a(Intent intent) {
        this.f897f.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = g.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f898g.getPackageManager());
            }
            f(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public p f(ComponentName componentName) {
        int size = this.f897f.size();
        try {
            Intent b2 = g.b(this.f898g, componentName);
            while (b2 != null) {
                this.f897f.add(size, b2);
                b2 = g.b(this.f898g, b2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f897f.iterator();
    }

    public void w() {
        x(null);
    }

    public void x(Bundle bundle) {
        if (!this.f897f.isEmpty()) {
            ArrayList<Intent> arrayList = this.f897f;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (androidx.core.content.a.h(this.f898g, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f898g.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
