package info.mukel.telegram.bots.v2.methods

import info.mukel.telegram.bots.v2.model.{InputFile, Message, ReplyMarkup}

/** sendPhoto
  *
  * Use this method to send photos. On success, the sent Message is returned.
  *
  * @param chatId	Integer or String	Unique identifier for the target chat or username of the target channel (in the format @channelusername)
  * @param photo	InputFile or String	Photo to send. You can either pass a file_id as String to resend a photo that is already on the Telegram servers, or upload a new photo using multipart/form-data.
  * @param caption	String	Optional	Photo caption (may also be used when resending photos by file_id), 0-200 characters
  * @param disableNotification	Boolean	Optional	Sends the message silently. iOS users will not receive a notification, Android users will receive a notification with no sound.
  * @param replyToMessageId	Integer	Optional	If the message is a reply, ID of the original message
  * @param replyMarkup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardHide or ForceReply	Optional	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to hide reply keyboard or to force a reply from the user.
  */
case class SendPhoto(
                    chatId              : Either[Long, String],
                    photo               : Either[InputFile, String],
                    caption             : Option[String] = None,
                    disableNotification : Option[Boolean] = None,
                    replyToMessageId    : Option[Long] = None,
                    replyMarkup         : Option[ReplyMarkup] = None
                    ) extends ApiRequestMultipart[Message]
