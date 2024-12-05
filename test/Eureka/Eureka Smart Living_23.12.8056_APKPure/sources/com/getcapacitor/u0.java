package com.getcapacitor;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.cordova.networkinformation.NetworkManager;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class u0 {
    private static final String BUNDLE_PERSISTED_OPTIONS_JSON_KEY = "_json";
    protected h bridge;
    protected x0 handle;
    private String lastPluginCallId;

    @Deprecated
    protected v0 savedLastCall;
    private final Map<String, androidx.activity.result.c> activityLaunchers = new HashMap();
    private final Map<String, androidx.activity.result.c> permissionLaunchers = new HashMap();
    private final Map<String, List<v0>> eventListeners = new HashMap();
    private final Map<String, List<j0>> retainedEventArguments = new HashMap();

    private void c(String str, v0 v0Var) {
        List<v0> list = this.eventListeners.get(str);
        if (list != null && !list.isEmpty()) {
            list.add(v0Var);
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.eventListeners.put(str, arrayList);
        arrayList.add(v0Var);
        l(str);
    }

    private androidx.activity.result.c d(v0 v0Var, String str) {
        androidx.activity.result.c cVar = this.activityLaunchers.get(str);
        if (cVar != null) {
            return cVar;
        }
        String format = String.format(Locale.US, "There is no ActivityCallback method registered for the name: %s. Please define a callback method annotated with @ActivityCallback that receives arguments: (PluginCall, ActivityResult)", str);
        l0.c(format);
        v0Var.r(format);
        return null;
    }

    private androidx.activity.result.c e(v0 v0Var, String str) {
        androidx.activity.result.c cVar = this.permissionLaunchers.get(str);
        if (cVar != null) {
            return cVar;
        }
        String format = String.format(Locale.US, "There is no PermissionCallback method registered for the name: %s. Please define a callback method annotated with @PermissionCallback that receives arguments: (PluginCall)", str);
        l0.c(format);
        v0Var.r(format);
        return null;
    }

    private String[] f(String[] strArr) {
        v0.b e6 = this.handle.e();
        HashSet hashSet = new HashSet();
        for (v0.c cVar : e6.permissions()) {
            if (Arrays.asList(strArr).contains(cVar.alias())) {
                hashSet.addAll(Arrays.asList(cVar.strings()));
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    private void g(v0 v0Var) {
        q0 c6 = this.handle.c();
        String[] permissions = c6.permissions();
        if (permissions.length <= 0) {
            v0Var.w();
        } else {
            saveCall(v0Var);
            pluginRequestPermissions(permissions, c6.permissionRequestCode());
        }
    }

    private void j(v0 v0Var, String[] strArr, String str) {
        androidx.activity.result.c e6 = e(v0Var, str);
        if (e6 == null) {
            return;
        }
        this.bridge.u0(v0Var);
        e6.a(strArr);
    }

    private void k(String str, v0 v0Var) {
        List<v0> list = this.eventListeners.get(str);
        if (list == null) {
            return;
        }
        list.remove(v0Var);
    }

    private void l(String str) {
        List<j0> list = this.retainedEventArguments.get(str);
        if (list == null) {
            return;
        }
        this.retainedEventArguments.remove(str);
        Iterator<j0> it = list.iterator();
        while (it.hasNext()) {
            notifyListeners(str, it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(Method method, androidx.activity.result.a aVar) {
        v0 C = this.bridge.C(this.lastPluginCallId);
        if (C == null) {
            C = this.bridge.z();
        }
        try {
            method.setAccessible(true);
            method.invoke(this, C, aVar);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(Method method, Map map) {
        v0 w5 = this.bridge.w(this.handle.a());
        if (this.bridge.H0(this, w5, map)) {
            try {
                method.setAccessible(true);
                method.invoke(this, w5);
            } catch (IllegalAccessException | InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    @a1(returnType = NetworkManager.TYPE_NONE)
    public void addListener(v0 v0Var) {
        String n6 = v0Var.n("eventName");
        v0Var.y(Boolean.TRUE);
        c(n6, v0Var);
    }

    @a1
    @v0.d
    public void checkPermissions(v0 v0Var) {
        Map<String, r0> permissionStates = getPermissionStates();
        if (permissionStates.size() == 0) {
            v0Var.w();
            return;
        }
        j0 j0Var = new j0();
        for (Map.Entry<String, r0> entry : permissionStates.entrySet()) {
            j0Var.put(entry.getKey(), entry.getValue());
        }
        v0Var.x(j0Var);
    }

    public void execute(Runnable runnable) {
        this.bridge.h(runnable);
    }

    @Deprecated
    public void freeSavedCall() {
        this.savedLastCall.v(this.bridge);
        this.savedLastCall = null;
    }

    public androidx.appcompat.app.c getActivity() {
        return this.bridge.j();
    }

    public String getAppId() {
        return getContext().getPackageName();
    }

    public h getBridge() {
        return this.bridge;
    }

    public w0 getConfig() {
        return this.bridge.n().l(this.handle.a());
    }

    @Deprecated
    public Object getConfigValue(String str) {
        try {
            return getConfig().d().get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public Context getContext() {
        return this.bridge.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getLogTag() {
        return l0.k(getClass().getSimpleName());
    }

    public r0 getPermissionState(String str) {
        return getPermissionStates().get(str);
    }

    public Map<String, r0> getPermissionStates() {
        return this.bridge.x(this);
    }

    public x0 getPluginHandle() {
        return this.handle;
    }

    @Deprecated
    public v0 getSavedCall() {
        return this.savedLastCall;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public void handleOnActivityResult(int i6, int i7, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnConfigurationChanged(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnNewIntent(Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnPause() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnRestart() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnResume() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnStart() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleOnStop() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public void handleRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        if (hasDefinedPermissions(strArr)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing the following permissions in AndroidManifest.xml:\n");
        for (String str : a1.d.b(getContext(), strArr)) {
            sb.append(str + "\n");
        }
        this.savedLastCall.r(sb.toString());
        this.savedLastCall = null;
    }

    @Deprecated
    public boolean hasDefinedPermissions(String[] strArr) {
        for (String str : strArr) {
            if (!a1.d.c(getContext(), str)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean hasDefinedRequiredPermissions() {
        v0.b e6 = this.handle.e();
        if (e6 == null) {
            return hasDefinedPermissions(this.handle.c().permissions());
        }
        for (v0.c cVar : e6.permissions()) {
            for (String str : cVar.strings()) {
                if (!a1.d.c(getContext(), str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasListeners(String str) {
        if (this.eventListeners.get(str) == null) {
            return false;
        }
        return !r2.isEmpty();
    }

    @Deprecated
    public boolean hasPermission(String str) {
        return androidx.core.content.a.a(getContext(), str) == 0;
    }

    @Deprecated
    public boolean hasRequiredPermissions() {
        v0.b e6 = this.handle.e();
        if (e6 == null) {
            for (String str : this.handle.c().permissions()) {
                if (androidx.core.content.a.a(getContext(), str) != 0) {
                    return false;
                }
            }
            return true;
        }
        for (v0.c cVar : e6.permissions()) {
            for (String str2 : cVar.strings()) {
                if (androidx.core.content.a.a(getContext(), str2) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initializeActivityLaunchers() {
        androidx.activity.result.c l02;
        Map<String, androidx.activity.result.c> map;
        ArrayList<Method> arrayList = new ArrayList();
        for (Class<?> cls = getClass(); !cls.getName().equals(Object.class.getName()); cls = cls.getSuperclass()) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
        }
        for (final Method method : arrayList) {
            if (method.isAnnotationPresent(v0.a.class)) {
                l02 = this.bridge.l0(new c.c(), new androidx.activity.result.b() { // from class: com.getcapacitor.s0
                    @Override // androidx.activity.result.b
                    public final void a(Object obj) {
                        u0.this.h(method, (androidx.activity.result.a) obj);
                    }
                });
                map = this.activityLaunchers;
            } else if (method.isAnnotationPresent(v0.d.class)) {
                l02 = this.bridge.l0(new c.b(), new androidx.activity.result.b() { // from class: com.getcapacitor.t0
                    @Override // androidx.activity.result.b
                    public final void a(Object obj) {
                        u0.this.i(method, (Map) obj);
                    }
                });
                map = this.permissionLaunchers;
            }
            map.put(method.getName(), l02);
        }
    }

    public boolean isPermissionDeclared(String str) {
        v0.b e6 = this.handle.e();
        if (e6 != null) {
            for (v0.c cVar : e6.permissions()) {
                if (str.equalsIgnoreCase(cVar.alias())) {
                    boolean z5 = true;
                    for (String str2 : cVar.strings()) {
                        z5 = z5 && a1.d.c(getContext(), str2);
                    }
                    return z5;
                }
            }
        }
        l0.c(String.format("isPermissionDeclared: No alias defined for %s or missing @CapacitorPlugin annotation.", str));
        return false;
    }

    public void load() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyListeners(String str, j0 j0Var) {
        notifyListeners(str, j0Var, false);
    }

    @Deprecated
    public void pluginRequestAllPermissions() {
        q0 c6 = this.handle.c();
        androidx.core.app.b.p(getActivity(), c6.permissions(), c6.permissionRequestCode());
    }

    @Deprecated
    public void pluginRequestPermission(String str, int i6) {
        androidx.core.app.b.p(getActivity(), new String[]{str}, i6);
    }

    @Deprecated
    public void pluginRequestPermissions(String[] strArr, int i6) {
        androidx.core.app.b.p(getActivity(), strArr, i6);
    }

    @a1(returnType = "promise")
    public void removeAllListeners(v0 v0Var) {
        this.eventListeners.clear();
        v0Var.w();
    }

    @a1(returnType = NetworkManager.TYPE_NONE)
    public void removeListener(v0 v0Var) {
        String n6 = v0Var.n("eventName");
        v0 C = this.bridge.C(v0Var.n("callbackId"));
        if (C != null) {
            k(n6, C);
            this.bridge.o0(C);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void requestAllPermissions(v0 v0Var, String str) {
        v0.b e6 = this.handle.e();
        if (e6 != null) {
            HashSet hashSet = new HashSet();
            for (v0.c cVar : e6.permissions()) {
                hashSet.addAll(Arrays.asList(cVar.strings()));
            }
            j(v0Var, (String[]) hashSet.toArray(new String[0]), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void requestPermissionForAlias(String str, v0 v0Var, String str2) {
        requestPermissionForAliases(new String[]{str}, v0Var, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void requestPermissionForAliases(String[] strArr, v0 v0Var, String str) {
        if (strArr.length == 0) {
            l0.c("No permission alias was provided");
            return;
        }
        String[] f6 = f(strArr);
        if (f6.length > 0) {
            j(v0Var, f6, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a  */
    @com.getcapacitor.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestPermissions(com.getcapacitor.v0 r11) {
        /*
            r10 = this;
            com.getcapacitor.x0 r0 = r10.handle
            v0.b r0 = r0.e()
            if (r0 != 0) goto Ld
            r10.g(r11)
            goto Le4
        Ld:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = "permissions"
            com.getcapacitor.g0 r2 = r11.c(r2)
            r3 = 0
            if (r2 == 0) goto L21
            java.util.List r2 = r2.a()     // Catch: org.json.JSONException -> L20
            goto L22
        L20:
        L21:
            r2 = r3
        L22:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = 0
            if (r2 == 0) goto L62
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L31
            goto L62
        L31:
            v0.c[] r0 = r0.permissions()
            int r6 = r0.length
            r7 = 0
        L37:
            if (r7 >= r6) goto L4f
            r8 = r0[r7]
            java.lang.String r9 = r8.alias()
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L4c
            java.lang.String r8 = r8.alias()
            r4.add(r8)
        L4c:
            int r7 = r7 + 1
            goto L37
        L4f:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L5b
            java.lang.String r0 = "No valid permission alias was requested of this plugin."
            r11.r(r0)
            goto Lad
        L5b:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r4.toArray(r0)
            goto Laa
        L62:
            v0.c[] r0 = r0.permissions()
            int r2 = r0.length
            r3 = 0
        L68:
            if (r3 >= r2) goto La4
            r6 = r0[r3]
            java.lang.String[] r7 = r6.strings()
            int r7 = r7.length
            if (r7 == 0) goto L90
            java.lang.String[] r7 = r6.strings()
            int r7 = r7.length
            r8 = 1
            if (r7 != r8) goto L88
            java.lang.String[] r7 = r6.strings()
            r7 = r7[r5]
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L88
            goto L90
        L88:
            java.lang.String r6 = r6.alias()
            r4.add(r6)
            goto La1
        L90:
            java.lang.String r7 = r6.alias()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto La1
            java.lang.String r6 = r6.alias()
            r1.add(r6)
        La1:
            int r3 = r3 + 1
            goto L68
        La4:
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r4.toArray(r0)
        Laa:
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3
        Lad:
            if (r3 == 0) goto Lb8
            int r0 = r3.length
            if (r0 <= 0) goto Lb8
            java.lang.String r0 = "checkPermissions"
            r10.requestPermissionForAliases(r3, r11, r0)
            goto Le4
        Lb8:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Le1
            com.getcapacitor.j0 r0 = new com.getcapacitor.j0
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lc7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.getcapacitor.r0 r3 = com.getcapacitor.r0.GRANTED
            java.lang.String r3 = r3.toString()
            r0.m(r2, r3)
            goto Lc7
        Ldd:
            r11.x(r0)
            goto Le4
        Le1:
            r11.w()
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getcapacitor.u0.requestPermissions(com.getcapacitor.v0):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void restoreState(Bundle bundle) {
    }

    @Deprecated
    public void saveCall(v0 v0Var) {
        this.savedLastCall = v0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle saveInstanceState() {
        v0 C = this.bridge.C(this.lastPluginCallId);
        if (C == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        j0 h6 = C.h();
        if (h6 != null) {
            bundle.putString(BUNDLE_PERSISTED_OPTIONS_JSON_KEY, h6.toString());
        }
        return bundle;
    }

    public void setBridge(h hVar) {
        this.bridge = hVar;
    }

    public void setPluginHandle(x0 x0Var) {
        this.handle = x0Var;
    }

    public Boolean shouldOverrideLoad(Uri uri) {
        return null;
    }

    @Deprecated
    protected void startActivityForResult(v0 v0Var, Intent intent, int i6) {
        this.bridge.C0(v0Var, intent, i6);
    }

    protected String getLogTag(String... strArr) {
        return l0.k(strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyListeners(String str, j0 j0Var, boolean z5) {
        l0.m(getLogTag(), "Notifying listeners for event " + str);
        List<v0> list = this.eventListeners.get(str);
        if (list != null && !list.isEmpty()) {
            Iterator it = new CopyOnWriteArrayList(list).iterator();
            while (it.hasNext()) {
                ((v0) it.next()).x(j0Var);
            }
            return;
        }
        l0.b(getLogTag(), "No listeners found for event " + str);
        if (z5) {
            List<j0> list2 = this.retainedEventArguments.get(str);
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            list2.add(j0Var);
            this.retainedEventArguments.put(str, list2);
        }
    }

    public void startActivityForResult(v0 v0Var, Intent intent, String str) {
        androidx.activity.result.c d6 = d(v0Var, str);
        if (d6 == null) {
            return;
        }
        this.bridge.x0(v0Var);
        this.lastPluginCallId = v0Var.g();
        this.bridge.s0(v0Var);
        d6.a(intent);
    }
}
