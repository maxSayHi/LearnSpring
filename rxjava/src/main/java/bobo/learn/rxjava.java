package bobo.learn;

import io.reactivex.*;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import org.junit.Test;

/**
 * Created by max on 17-3-9.
 */
public class rxjava {
    @Test
    public void testObserver(){
//        Flowable.just("hello!","i","am","bobo")
//                .subscribeOn(Schedulers.io())
//                .observeOn(Schedulers.io())
//                .subscribe(new Consumer<String>() {
//            public void accept(@NonNull String s) throws Exception {
//                System.out.println(s);
//            }
//        });
        Flowable.create(new FlowableOnSubscribe<String>() {
            public void subscribe(FlowableEmitter<String> flowableEmitter) throws Exception {
                System.out.println("subScribe!!!");
                flowableEmitter.onNext("onNext!!!!!");
                flowableEmitter.onComplete();
            }
        },BackpressureStrategy.BUFFER)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Consumer<String>() {
            public void accept(@NonNull String s) throws Exception {
                System.out.println(s);
            }
        });
    }
}
