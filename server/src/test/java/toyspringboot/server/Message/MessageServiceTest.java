//package toyspringboot.server.TestDesign.Message;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//import toyspringboot.server.Domain.Dto.MessageDto;
//import toyspringboot.server.Service.MessageService;
//import toyspringboot.server.TestDesign.DomainTest;
//import toyspringboot.server.TestDesign.ServiceTest;
//
//import java.lang.reflect.InvocationTargetException;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static toyspringboot.server.Message.MessageConstants.MESSAGE_CONTENT;
//import static toyspringboot.server.Message.MessageConstants.MESSAGE_ID;
//
//@SpringBootTest
//@Transactional
//public class MessageServiceTest extends DomainTest {
//    @Autowired
//    private MessageService messageService;
//
//    private final ServiceTest serviceTest;
//
//    public MessageServiceTest() {
//        this.serviceTest = new ServiceTest();
//    }
//
//    @Test
//    @DisplayName("메시지 생성 테스트")
//    public void createTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
//        // given
//        // MessageConstants.MESSAGE_CONTENT
//
//        MessageDto messageDto = MessageDto.builder()
//                .message(MESSAGE_CONTENT)
//                .build();
//
//        // when
//        MessageDto newMessage = serviceTest.createTest(messageDto, messageService, "createMessage");
//
//        // then
//        assertEquals(MESSAGE_CONTENT, newMessage.getMessage());
//    }
//
//    @Test
//    @DisplayName("메시지 조회 테스트")
//    public void readTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
//        // given
//        // MessageConstants.MESSAGE_ID
//
//        // when
//        MessageDto searchedMessage = ServiceTest.readTest(MESSAGE_ID, messageService, "searchMessage");
//
//        // then
//        assertEquals(MESSAGE_ID, searchedMessage.getId());
//    }
//
//    @Test
//    @DisplayName("메시지 수정 테스트")
//    public void updateTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        // given
//        // MessageConstants.MESSAGE_ID
//        // MessageConstants.MESSAGE_CONTENT
//
//        // when
//        MessageDto updatedMessage = ServiceTest.updateTest(MESSAGE_ID, MESSAGE_CONTENT, messageService, "updateMessage");
//
//        // then
//        assertEquals(MESSAGE_CONTENT, updatedMessage.getMessage());
//    }
//
//
//    @Test
//    @DisplayName("메시지 삭제 테스트")
//    public void deleteTest() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
//        // given
//        // MessageConstants.MESSAGE_ID
//
//        // when, then
//        assertTrue((boolean) ServiceTest.deleteTest(MESSAGE_ID, messageService, "deleteMessage"));
//    }
//}