package home.service;

import com.grpc.server.TestRequest;
import com.grpc.server.TestResponse;
import com.grpc.server.TestServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TestServiceImpl extends TestServiceGrpc.TestServiceImplBase {

    @Override
    public void ping(TestRequest request, StreamObserver<TestResponse> responseObserver) {
        String ping = new StringBuilder()
                .append("test").toString();
        TestResponse response = TestResponse.newBuilder().setPong(ping).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
