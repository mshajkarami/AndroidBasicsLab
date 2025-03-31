package ir.hajkarami.workmanagerapp;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {
    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        // get the data
        int countLimit = getInputData().getInt("count_Limit", 0);

        // Do the work here--in this case, count to 1000.
        for (int i = 0; i <= countLimit; i++) {
            Log.i("Counter", "Count is: " + i);
        }
        return Result.success();
    }
}
