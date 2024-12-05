package cm.aptoide.pt.actions;

import rx.e;
import rx.j;

/* loaded from: classes.dex */
public class RequestAccessToExternalFileSystemOnSubscribe implements e.a<Void> {
    private final PermissionService permissionService;

    public RequestAccessToExternalFileSystemOnSubscribe(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$call$0(j jVar) {
        if (jVar.isUnsubscribed()) {
            return;
        }
        jVar.onNext(null);
        jVar.onCompleted();
    }

    @Override // rx.m.b
    public void call(final j<? super Void> jVar) {
        this.permissionService.requestAccessToExternalFileSystem(new rx.m.a() { // from class: cm.aptoide.pt.actions.c
            @Override // rx.m.a
            public final void call() {
                RequestAccessToExternalFileSystemOnSubscribe.lambda$call$0(j.this);
            }
        }, new rx.m.a() { // from class: cm.aptoide.pt.actions.d
            @Override // rx.m.a
            public final void call() {
                j.this.onError(new SecurityException("Permission denied to access to external storage."));
            }
        });
    }
}
