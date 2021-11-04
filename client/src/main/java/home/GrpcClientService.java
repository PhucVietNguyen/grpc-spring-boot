package home;

import com.grpc.server.TestRequest;
import com.grpc.server.TestResponse;
import com.grpc.server.TestServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    public String ping() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8881)
                .usePlaintext()
                .build();
        TestServiceGrpc.TestServiceBlockingStub stub = TestServiceGrpc.newBlockingStub(channel);
        TestResponse response = stub.ping(TestRequest.newBuilder().setPing("").build());
        channel.shutdown();
        return response.getPong();
    }
}
