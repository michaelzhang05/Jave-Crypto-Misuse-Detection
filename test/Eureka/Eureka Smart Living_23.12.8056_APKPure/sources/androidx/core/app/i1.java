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

/* loaded from: classes.dex */
public final class i1 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f1951a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Context f1952b;

    /* loaded from: classes.dex */
    public interface a {
        Intent k();
    }

    private i1(Context context) {
        this.f1952b = context;
    }

    public static i1 k(Context context) {
        return new i1(context);
    }

    public i1 h(Intent intent) {
        this.f1951a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1 i(Activity activity) {
        Intent k6 = activity instanceof a ? ((a) activity).k() : null;
        if (k6 == null) {
            k6 = r.a(activity);
        }
        if (k6 != null) {
            ComponentName component = k6.getComponent();
            if (component == null) {
                component = k6.resolveActivity(this.f1952b.getPackageManager());
            }
            j(component);
            h(k6);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f1951a.iterator();
    }

    public i1 j(ComponentName componentName) {
        int size = this.f1951a.size();
        try {
            Context context = this.f1952b;
            while (true) {
                Intent b6 = r.b(context, componentName);
                if (b6 == null) {
                    return this;
                }
                this.f1951a.add(size, b6);
                context = this.f1952b;
                componentName = b6.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e6) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e6);
        }
    }

    public void l() {
        m(null);
    }

    public void m(Bundle bundle) {
        if (this.f1951a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1951a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.j(this.f1952b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1952b.startActivity(intent);
    }
}
