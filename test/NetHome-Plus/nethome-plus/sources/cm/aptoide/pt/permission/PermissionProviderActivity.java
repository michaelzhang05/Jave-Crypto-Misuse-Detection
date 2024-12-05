package cm.aptoide.pt.permission;

import android.os.Bundle;
import android.util.SparseArray;
import cm.aptoide.pt.permission.PermissionProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class PermissionProviderActivity extends PermissionServiceActivity implements PermissionProvider {
    private e.g.b.c<Set<PermissionProvider.Permission>> permissionRelay;
    private SparseArray<Set<PermissionProvider.Permission>> requestedCodeGrantedPermissions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Set lambda$permissionResults$0(Set set, Set set2) {
        set.addAll(set2);
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterable lambda$permissionResults$1(Set set) {
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$permissionResults$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e a(final int i2, Set set) {
        return rx.e.d1(rx.e.S(set), rx.e.S(this.requestedCodeGrantedPermissions.get(i2)), new rx.m.f() { // from class: cm.aptoide.pt.permission.e
            @Override // rx.m.f
            public final Object a(Object obj, Object obj2) {
                Set set2 = (Set) obj;
                PermissionProviderActivity.lambda$permissionResults$0(set2, (Set) obj2);
                return set2;
            }
        }).J(new rx.m.e() { // from class: cm.aptoide.pt.permission.c
            @Override // rx.m.e
            public final Object call(Object obj) {
                Set set2 = (Set) obj;
                PermissionProviderActivity.lambda$permissionResults$1(set2);
                return set2;
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.permission.f
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                int i3 = i2;
                valueOf = Boolean.valueOf(r0 == r1.getRequestCode());
                return valueOf;
            }
        }).Y0().D(new rx.m.e() { // from class: cm.aptoide.pt.permission.d
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                List list = (List) obj;
                valueOf = Boolean.valueOf(!list.isEmpty());
                return valueOf;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.permission.PermissionServiceActivity, cm.aptoide.pt.navigator.ActivityResultNavigator, cm.aptoide.pt.view.BaseActivity, com.trello.rxlifecycle.h.a.a, androidx.appcompat.app.d, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.permissionRelay = e.g.b.c.f1();
        this.requestedCodeGrantedPermissions = new SparseArray<>();
    }

    @Override // cm.aptoide.pt.permission.PermissionServiceActivity, androidx.fragment.app.c, android.app.Activity, androidx.core.app.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            hashSet.add(new PermissionProvider.Permission(i2, strArr[i3], iArr[i3] == 0));
        }
        this.permissionRelay.call(hashSet);
    }

    @Override // cm.aptoide.pt.permission.PermissionProvider
    public rx.e<List<PermissionProvider.Permission>> permissionResults(final int i2) {
        return this.permissionRelay.G(new rx.m.e() { // from class: cm.aptoide.pt.permission.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                return PermissionProviderActivity.this.a(i2, (Set) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.permission.PermissionProvider
    public void providePermissions(String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.requestedCodeGrantedPermissions.clear();
        for (String str : strArr) {
            if (androidx.core.content.a.a(this, str) == 0) {
                hashSet.add(new PermissionProvider.Permission(i2, str, true));
            } else {
                arrayList.add(str);
            }
        }
        this.requestedCodeGrantedPermissions.put(i2, hashSet);
        if (arrayList.isEmpty()) {
            this.permissionRelay.call(hashSet);
        } else {
            androidx.core.app.a.p(this, (String[]) arrayList.toArray(new String[0]), i2);
        }
    }
}
